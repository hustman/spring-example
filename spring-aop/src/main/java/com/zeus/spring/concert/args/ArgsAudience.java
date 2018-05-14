package com.zeus.spring.concert.args;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author xuxingbo
 * @Date 2018/5/14
 */
@Aspect
public class ArgsAudience {

    @Pointcut("execution(* com.zeus.spring.concert.args.ArgsPerformance.perform(int)) && args(order)")
    public void argsPerformance(int order){}
    
    @Before("argsPerformance(order)")
    public void annoceItem(int order){
        System.out.println("[Before] next item order is " + order);
    }
}
