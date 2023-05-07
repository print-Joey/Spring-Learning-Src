package com.joey.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//18.7 => 让spring知道这是一个bean
@Component
//18.8 => 让spring知道这是一个通知类   下步见SpringConfig
@Aspect
//18.3 =>创建通知类
public class MyAdvice  {
    //18.5 => 配置切入点
    @Pointcut("execution(void com.joey.dao.BookDAO.update())")
    private void pt(){
    }


    //18.6 =>添加before注解使切入点有联系
    @Before("pt()")
    //18.4 =>创建共性功能方法
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}
