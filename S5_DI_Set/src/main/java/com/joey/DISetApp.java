package com.joey;

import com.joey.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DISetApp {
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        BookService bookService = (BookService) classPathXmlApplicationContext.getBean("bookService");
        bookService.save();
    }
}
