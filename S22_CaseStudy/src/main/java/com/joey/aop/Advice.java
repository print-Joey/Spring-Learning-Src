package com.joey.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class Advice {
    @Pointcut("execution(* com.joey.service.ResourceService.openLink(..))")
    public void pt(){

    }

    //public Object
    @Around("Advice.pt()")
    public Object trimPwd(ProceedingJoinPoint pjp)  {
        Object[] args = pjp.getArgs();
        for (int i = 0; i < args.length; i++) {
            if(args[i] instanceof String){
                args[i] = args[i].toString().trim();
                System.out.println(args[i]);
            }
        }

        Object ret = null;
        try {
            ret = pjp.proceed(args);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        return ret;
    }
}
