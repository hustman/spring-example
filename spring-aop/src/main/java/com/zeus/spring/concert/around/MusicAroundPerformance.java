package com.zeus.spring.concert.around;

/**
 * @author xuxingbo
 * @Date 2018/5/14
 */
public class MusicAroundPerformance implements AroundPerformance {
    @Override
    public void perform() {
        System.out.println("Playing beautiful around music");
    }
}
