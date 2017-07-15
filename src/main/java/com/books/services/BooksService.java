package com.books.services;

import com.books.model.Books;

import java.util.List;

/**
 * 图书查询方法接口
 */
public interface BooksService {
    List<Books> selectByPriceDESC();

    List<Books> selectByPriceAsc();
}
