package com.zeus.spring.concert;


/**
 * @author xuxingbo
 * @Date 2018/5/11
 */
public class MusicPerformance implements Performance {
    @Override
    public void perform() {
        System.out.println("Playing beautiful music");
    }
    
}
