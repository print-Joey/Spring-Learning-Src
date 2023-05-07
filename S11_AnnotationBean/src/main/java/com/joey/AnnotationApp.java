package com.joey;

import com.joey.config.SpringConfig;
import com.joey.dao.BookDAO;
import com.joey.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//https://cyborg2077.github.io/2022/08/29/Spring/

public class AnnotationApp {

    public static void main(String[] args) {

        //旧方法xml创建IOC容器
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //(新)纯注解创建IOC容器
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDAO bookDAO = (BookDAO) ctx.getBean("BookDao");


        System.out.println(bookDAO);

        BookService bookService = ctx.getBean(BookService.class);
        System.out.println(bookService);
    }
}
