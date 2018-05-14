package com.zeus.spring.concert.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author xuxingbo
 * @Date 2018/5/14
 */
@Aspect
public class AroundAudience {
    
    @Pointcut("execution(* com.zeus.spring.concert.around.AroundPerformance.perform(..))")
    public void performance(){}
    
    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint pj){
        
        try {
            System.out.println("before watching performance");
            pj.proceed();
            System.out.println("after watching performance");
        }catch (Throwable e){
            System.out.println("watching performance occur exception");
        }
    }
    
}
