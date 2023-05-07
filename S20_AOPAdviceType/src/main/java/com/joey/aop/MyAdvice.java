package com.joey.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice  {

    @Pointcut("execution(int com.joey.dao.BookDAO.select())")
    private void pt(){
    }


   //20.1 增强功能在前

   // @Before("pt()")
    public void before(){
        System.out.println("Before Advice");
    }

    //20.2 增强功能环绕     @Around("pt()")
    //ProceedingJoinPoint pjp.proceed()来执行原始方法

    @Around("pt()")
    public int around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around Advice(before)");
        Integer num = (Integer)pjp.proceed();
        System.out.println("around Advice(After)");
        return num;
    }

    //20.3 增强功能在后

    //@After("pt()")
    public void after(){
        System.out.println("after Advice");
    }

    //20.3 增强功能在抛出异常后
    @AfterThrowing("pt()")
    public void AfterThrowing(){
        System.out.println("AfterThrowing Advice");
    }


}
