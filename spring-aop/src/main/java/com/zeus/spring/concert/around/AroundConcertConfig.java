package com.zeus.spring.concert.around;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author xuxingbo
 * @Date 2018/5/14
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class AroundConcertConfig {

    @Bean
    public AroundAudience aroundAudience(){
        return new AroundAudience();
    }
    
    @Bean
    public MusicAroundPerformance musicAroundPerformance(){
        return new MusicAroundPerformance();
    }
}
