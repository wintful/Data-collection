package com.books.constant;

/**
 * 当当网Xpath节点相关配置
 */
public class WebInfo {
    // 图书信息入口
    public static final String URL_START = "http://category.dangdang.com/cp01.05.00.00.00.00.html";
    // 图书二级分类上层节点
    public static final String URL_ALL_NODE = "//div[@class='select_frame']";
    // 当前页中所有图书信息
    public static final String URL_CURRENT_PAGE_BOOKS_INFO = "div[@id='search_nature_rg]/ul/li";

}
