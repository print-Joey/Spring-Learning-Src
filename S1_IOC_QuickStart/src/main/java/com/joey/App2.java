package com.joey;

import com.joey.dao.BookDAO;
import com.joey.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        //获取ioc容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取bean
        //BookDAO bookDao = (BookDAO) context.getBean("bookDAO");
        //bookDao.save();

        BookService bookService = (BookService) context.getBean("bookService");
        bookService.save();
    }
}
