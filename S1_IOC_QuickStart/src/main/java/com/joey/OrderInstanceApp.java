package com.joey;

import com.joey.dao.OrderDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderInstanceApp {
    public static void main(String[] args) {
        //通过工厂造对象 (非Spring)
        //BookDAO bookDao = BookDaoFactory.getBookDao();
        //bookDao.save();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        OrderDao orderDao = (OrderDao) ctx.getBean("OrderDao");
        orderDao.save();


    }
}
