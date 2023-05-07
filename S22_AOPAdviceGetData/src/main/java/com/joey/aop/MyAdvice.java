package com.joey.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice  {

    @Pointcut("execution(* com.joey.dao.BookDAO.findName(*))")
    private void pt(){
    }



    public void before(){
        System.out.println("Before Advice");
    }


    @Around("pt()")
    public  Object around(ProceedingJoinPoint pjp) throws Throwable {

        //22.1 => 获取原始方法的形参
        Object[] args = pjp.getArgs();
        for (int i = 0; i < args.length; i++) {
            System.out.println("原始方法的形参:" +args[i]);
        }

        System.out.println("around Advice(before)");
        Object proceed = pjp.proceed();
        System.out.println("around Advice(After)");
        return proceed;
    }


    public void after(){
        System.out.println("after Advice");
    }

    //22.2 => 加上throwing属性可以给AfterThrowing 对异常进行处理
    @AfterThrowing(value = "pt()",throwing = "e")
    public void AfterThrowing(Exception e){
        System.out.println("AfterThrowing Advice");
    }

    //22.4 => 加上throwing属性可以给AfterThrowing 对返回值进行处理
    @AfterReturning(value = "pt()",returning = "ret")
    public void AfterReturning(Object ret){
        System.out.println("AfterReturning Advice");
        System.out.println("Returning Value 原始方法的方法:=>"+ret);
    }

}
