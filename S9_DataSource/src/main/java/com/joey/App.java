package com.joey;

import com.joey.dao.BookDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App {

    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        DataSource dataSource = (DataSource) classPathXmlApplicationContext.getBean("dataSource");

        System.out.println(dataSource);

        DataSource dataSource1 = (DataSource) classPathXmlApplicationContext.getBean("dataSource1");

        System.out.println(dataSource1);
    }
}
