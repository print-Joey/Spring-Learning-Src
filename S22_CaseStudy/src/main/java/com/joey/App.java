package com.joey;

import com.joey.config.SpringConfig;
import com.joey.service.ResourceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 防止用户手滑多打一个空格, 通过AOP技术调用String.trim()来删除用户的空格
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        ResourceService resourceService = ctx.getBean(ResourceService.class);
        System.out.println(resourceService);
        System.out.println(resourceService.getClass());
        boolean flag = resourceService.openLink("http://pan.baidu.com/haa","root ");
        System.out.println(flag);

    }
}
//本课出现的异常
//NoSuchBeanDefinitionException:
/*
Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.joey.service.ResourceService' available
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:351)
        at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:342)
        at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1127)
        at com.joey.App.main(App.java:18)*/

//由在ResourceServiceImp没加 /* implements ResourceService*/ 所导致
