package com.zeus.spring.concert.args;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author xuxingbo
 * @Date 2018/5/14
 */
@Configuration
@ComponentScan
public class ArgsConcertConfig {

    @Bean
    public ArgsAudience argsAudience(){
        return new ArgsAudience();
    }
    
    @Bean
    public ArgsMusicPerformance argsMusicPerformance(){
        return new ArgsMusicPerformance();
    }
}
