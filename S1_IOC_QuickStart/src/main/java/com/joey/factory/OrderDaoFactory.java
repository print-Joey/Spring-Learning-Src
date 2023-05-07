package com.joey.factory;

import com.joey.dao.BookDAO;
import com.joey.dao.Imp.BookDAOImpl;
import com.joey.dao.Imp.OrderDaoImpl;
import com.joey.dao.OrderDao;

//Spring-08 Bean实例化 工厂类
public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        //<!--    可以先走一些配置-->
        System.out.println("setups");
        return new OrderDaoImpl();
    }
}
