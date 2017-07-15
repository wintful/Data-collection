package com.books.services;


import com.books.constant.WebInfo;
import com.books.dao.BooksMapper;
import com.books.model.Books;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.selector.Html;


import java.io.InputStream;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 当当网数据抓取关键类
 */

public class DangdangRepoPageProcessor implements PageProcessor {

    private static SqlSessionFactory sqlSessionFactory;

    // 设置爬虫相关信息
    private Site site = Site.me().setTimeOut(10000).setRetryTimes(3).setSleepTime(500);
    private Logger log = Logger.getLogger(this.getClass());
    private List<String> urlsList = new ArrayList<String>();

    public void process(Page page) {
        //初始化Mybatis配置
        try {
            DangdangRepoPageProcessor.init();
        } catch (Exception e) {

        }
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BooksMapper booksMapper = sqlSession.getMapper(BooksMapper.class);
        log.info("Request: " + page.getUrl());
        if (urlsList.size() == 0) {
            //得到图书二级分类中所有链接
            urlsList = page.getHtml().xpath(WebInfo.URL_ALL_NODE).links().all();
        }
        // 当前页中所有图书信息
        List<String> currentPageBookList = page.getHtml().xpath(WebInfo.URL_CURRENT_PAGE_BOOKS_INFO).all();
        //解析包含所有图书信息的集合,并抽取关键内容
        for (String heard : currentPageBookList) {
            Html content = Html.create(heard);
            try {
                //得到当前节点中包含的信息
                String bookinfo = content.$("img").toString();
                String bookName = StringUtils.substringBetween(bookinfo, "alt=\"", "\">").trim();
                String bookImage = StringUtils.substringBetween(bookinfo, "=\"", "\"").trim();
                String bookSynopsis = content.xpath("//p[@class='name']/a/text()").toString().trim();
                String bookPrice = content.xpath("//p[@class='price']/span/text()").toString().substring(1).trim();
                String bookOriginalPrice = content.xpath("//span[@class='search_pre_price']/text()").toString().substring(1).trim();
                String bookDiscount = content.xpath("//span[@class='search_discount']/text()").toString().replaceAll("[()折]", "").substring(1);
                String bookAuthor = content.xpath("//P[@class='search_book_author']/span/a/text()").toString().trim();
                String bookTime = content.xpath("//P[@class='search_book_author']/span[2]/text()").toString().replace("/", "").trim();
                String bookPress = content.xpath("//P[@class='search_book_author']/span[3]/a/text()").toString().trim();
                String bookDescription = content.xpath("//p[@class='detail']/text()").toString().trim();

                // 时间转换
                DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
                Date date = null;
                try {
                    date = fmt.parse(bookTime);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                Books books = new Books(bookName, bookImage, bookSynopsis, new BigDecimal(bookPrice), new BigDecimal(bookOriginalPrice), Float.parseFloat(bookDiscount), bookAuthor, date, bookPress, bookDescription);
                log.info(books);
                //向数据库插入
                booksMapper.insert(books);
                sqlSession.commit();
            } catch (NullPointerException e) {
                page.setSkip(true);
                e.printStackTrace();
            }
        }
        //得到当前分类图书中的所有页链接
        List<String> allPageUrlList = page.getHtml().css("div.paging").links().all();
        //添加分页链接
        page.addTargetRequests(allPageUrlList);
        //添加分类链接
        page.addTargetRequests(urlsList);
    }

    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        Spider.create(new DangdangRepoPageProcessor()).addUrl(WebInfo.URL_START).thread(5).run();
    }

    public static void init() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

}
