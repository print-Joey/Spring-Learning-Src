package com.joey.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {
    @Pointcut("execution(* com.joey.service.*Service.*(..))")
    private void servicePt(){}

    @Around("ProjectAdvice.servicePt()")
    public void efficiencyTest(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
        String className = signature.getDeclaringTypeName();
        String methodName = signature.getName();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            pjp.proceed();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("业务层接口万次执行时间: "+className+"."+methodName+"-----> "+(endTime-startTime)+ "ms");
    }
}
