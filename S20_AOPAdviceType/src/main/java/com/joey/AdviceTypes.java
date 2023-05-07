package com.joey;

import com.joey.config.SpringConfig;
import com.joey.dao.BookDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//https://cyborg2077.github.io/2022/08/29/Spring/

public class AdviceTypes {

    public static void main(String[] args) {

        //旧方法xml创建IOC容器
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //(新)纯注解创建IOC容器
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDAO bookDAO = (BookDAO) ctx.getBean("BookDao");
        System.out.println("===============================");
        System.out.println(bookDAO);
        System.out.println(bookDAO.getClass());
        System.out.println("===============================");

        bookDAO.select();
    }
}
