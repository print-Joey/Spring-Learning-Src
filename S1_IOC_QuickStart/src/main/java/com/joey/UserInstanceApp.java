package com.joey;

import com.joey.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserInstanceApp {


    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");



        UserDao userDao = (UserDao) ctx.getBean("userDao1");
        UserDao userDao2 = (UserDao) ctx.getBean("userDao");

        userDao.save();
        userDao2.save();
        System.out.println(userDao2);
        System.out.println(userDao);
    }


}
