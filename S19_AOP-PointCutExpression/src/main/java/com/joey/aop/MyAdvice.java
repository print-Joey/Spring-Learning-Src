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
    //@Pointcut("execution(void com.joey.dao.BookDAO.update())")

    //19.1 => 切入点表达式 PointCut Expression
    //匹配实现类
    //@Pointcut("execution(void com.joey.dao.BookDAOImpl.update())")

    //下面星号表示 有1及以上个形参   update()无形参 因此匹配不上
    //@Pointcut("execution(void com.joey.dao.Imp.BookDAOImpl.update(*))")

    //匹配不上 因为*在目录层级里表示任意名字 不表示任意层级
    //@Pointcut("execution(void com.*.*.update())")

    //应改为
    // ps:(..)表示任意名字 也表示任意层级(包括0)
    //@Pointcut("execution(void com..update())")
    @Pointcut("execution(void com..*e(..))")
    private void pt(){
    }


    //18.6 =>添加before注解使切入点有联系
    @Before("pt()")
    //18.4 =>创建共性功能方法
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}
