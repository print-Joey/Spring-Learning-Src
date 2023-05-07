package com.joey;

import com.joey.config.SpringConfig;
import com.joey.dao.BookDAO;
import com.joey.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

//https://cyborg2077.github.io/2022/08/29/Spring/

public class AnnotationDIApp {

    public static void main(String[] args) {

        //旧方法xml创建IOC容器
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //(新)纯注解创建IOC容器
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
//本课重点com/joey/config/JDBCConfig.java和com/joey/config/SpringConfig.java
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource);

    }
}
