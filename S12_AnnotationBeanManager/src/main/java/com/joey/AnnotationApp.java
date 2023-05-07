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
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDAO bookDAO1 = ctx.getBean(BookDAO.class);
        BookDAO bookDAO2 = ctx.getBean(BookDAO.class);


        //在BookDAOImpl里设置
        //@Scope注解
        //为单例 singleton
        //运行结果  地址值一样
/*        com.joey.dao.Imp.BookDAOImpl@1a482e36
        com.joey.dao.Imp.BookDAOImpl@1a482e36*/

        //为双例 prototype
        //运行结果  地址值不一样
       /* com.joey.dao.Imp.BookDAOImpl@1a482e36
        com.joey.dao.Imp.BookDAOImpl@72967906*/

        System.out.println(bookDAO1);
        System.out.println(bookDAO2);


        //IOC容器关闭 destroy方法才执行

        //多例模式下spring不负责销毁(管理bean的生命周期)，所以没有调用destroy方法
        ctx.close();

    }
}
