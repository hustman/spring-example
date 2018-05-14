package com.zeus.spring.concert.args;

/**
 * @author xuxingbo
 * @Date 2018/5/14
 */
public class ArgsMusicPerformance implements ArgsPerformance {
    @Override
    public void perform(int order) {
        System.out.println("Perform with order: " + order);
    }
}
