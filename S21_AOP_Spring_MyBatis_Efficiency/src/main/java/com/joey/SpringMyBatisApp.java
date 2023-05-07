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


//本课出现的bug  org.springframework.beans.factory.NoSuchBeanDefinitionException
//Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.joey.service.AccountService' available
//        at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:351)
//        at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:342)
//        at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1127)
//        at com.joey.SpringMyBatisApp.main(SpringMyBatisApp.java:23)

//通过debug发现
//Spring没有创建AccountService的bean

//原因是把@Service 加在了接口类上
//接口类无法实例化,所以没有bean

//解决办法:
//把@Service加在接口的实现类上
//public interface AccountService {
//[org.springframework.context.annotation.internalConfigurationAnnotationProcessor, org.springframework.context.annotation.internalAutowiredAnnotationProcessor, org.springframework.context.annotation.internalCommonAnnotationProcessor, org.springframework.context.event.internalEventListenerProcessor, org.springframework.context.event.internalEventListenerFactory, springConfig, com.joey.config.JDBCConfig, dataSource, com.joey.config.MybatisConfig, sqlSessionFactory, mapperScannerConfigurer, accountDao]
//beanDefinitionNames