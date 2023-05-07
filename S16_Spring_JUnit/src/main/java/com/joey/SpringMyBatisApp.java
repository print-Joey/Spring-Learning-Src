package com.joey;

import com.joey.config.SpringConfig;
import com.joey.dao.AccountDao;
import com.joey.domain.Account;
import com.joey.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

//https://cyborg2077.github.io/2022/08/29/Spring/

public class SpringMyBatisApp {

    public static void main(String[] args) {

        //旧方法xml创建IOC容器
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        //(新)纯注解创建IOC容器
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService as = ctx.getBean(AccountService.class);

        Account a = as.findById(2);

        System.out.println(a);

    }
}

