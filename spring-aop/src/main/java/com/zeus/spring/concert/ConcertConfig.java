package com.zeus.spring.concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author xuxingbo
 * @Date 2018/5/11
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class ConcertConfig {
    
    @Bean
    public Audience audience(){
        return new Audience();
    }
    
    @Bean
    public Performance performance(){
        return new MusicPerformance();
    }
}
