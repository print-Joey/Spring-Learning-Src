package com.joey;

import com.joey.dao.BookDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleApp {

    public static void main(String[] args) {

        //ApplicationContext里没有close方法   所以如果要运行destroy方法就要调用close方法   要用子类ClassPathXmlApplicationContext
       // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        BookDAO bookDAO = (BookDAO) context.getBean("bookDAO");
        bookDAO.save();


        //i关闭容器的两种方式
        //context.registerShutdownHook();
        context.close();

    }
}
