package com.books.controller;


import com.alibaba.fastjson.JSON;
import com.books.model.Books;
import com.books.services.BooksService;
import com.books.services.impl.BooksServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


/**
 * Created by Admin on 2017/7/11.
 */
public class DataAnalysisServlet extends HttpServlet {

    private String message;

    public void init() throws ServletException {
        // 执行必需的初始化
        message = "Hi AJAX";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应内容类型
        response.setContentType("text/json;charset=utf-8");
        String op = request.getParameter("op");
        if (op.equals("pricedesc")) {
            this.pricedesc(request, response);
        }
        PrintWriter out = response.getWriter();
        out.println(message);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    public void pricedesc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.print("test");
        BooksService booksService = new BooksServiceImpl();
        List<Books> booksList = booksService.selectByPriceDESC();
        String jsonData = JSON.toJSONString(booksList);
        PrintWriter out = response.getWriter();
        out.println(jsonData);
    }

    public void destroy() {

    }


}
