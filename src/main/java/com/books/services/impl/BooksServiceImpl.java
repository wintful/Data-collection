package com.books.services.impl;

import com.books.dao.BooksMapper;
import com.books.model.Books;
import com.books.services.BooksService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 图书查询方法接口实现类
 */
public class BooksServiceImpl implements BooksService {

    private SqlSessionFactory sqlSessionFactory;
    String resource = "mybatis-config.xml";

    /**
     * 按照图书价格降序排序查询方法
     *
     * @return List
     */
    @Override
    public List<Books> selectByPriceDESC() {
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BooksMapper mapper = sqlSession.getMapper(BooksMapper.class);
        List<Books> booksList = mapper.selectByPriceDesc();
        return booksList;
    }

    /**
     * 按照图书价格升序排序查询方法
     *
     * @return List
     */
    @Override
    public List<Books> selectByPriceAsc() {
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BooksMapper mapper = sqlSession.getMapper(BooksMapper.class);
        List<Books> booksList = mapper.selectByPriceAsc();
        return booksList;
    }
}
