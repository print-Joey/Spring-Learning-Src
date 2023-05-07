package com.joey;

import com.joey.dao.BookDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionApp {

    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        BookDAO BookDAO = (BookDAO) classPathXmlApplicationContext.getBean("bookDAO");
        BookDAO.save();
    }
}
