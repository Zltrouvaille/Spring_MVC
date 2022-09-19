package org.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {
    @Pointcut("execution(* org.service.*Service.*(..))")
    private void Accountpt(){}

    @Before("Accountpt()")
    public void befor(JoinPoint jp){
        Object[] args = jp.getArgs();

    }

//    @Around("ProjectAdvice.Accountpt()")
    public void  runSpeed(ProceedingJoinPoint joinPoint)throws Throwable
    {
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 10000;i++){
            joinPoint.proceed();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}
