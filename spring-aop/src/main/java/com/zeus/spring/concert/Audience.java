package com.zeus.spring.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author xuxingbo
 * @Date 2018/5/11
 */
@Aspect
public class Audience {
    /**
     * 定义切点
     */
    @Pointcut("execution(* com.zeus.spring.concert.Performance.perform(..))")
    public void performance(){}
    
    
    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("Silencing Cell phones");
    }

    @Before("performance()")
    public void takeSeats(){
        System.out.println("Taking seats");
    }
    
    
    @AfterReturning("performance()")
    public void applause(){
        System.out.println("CLAP, CLAP, CLAP");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp){
        try {
            System.out.println("Silencing Cell phones");
            System.out.println("Taking seats");
            jp.proceed();
            System.out.println("CLAP, CLAP, CLAP");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund");
        }

    }
}
