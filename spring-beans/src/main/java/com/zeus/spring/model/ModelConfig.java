package com.zeus.spring.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author xuxingbo
 * @Date 2018/5/10
 */
@ComponentScan
@Configuration
@ImportResource("classpath:spring-beans.xml")
public class ModelConfig {
    
    
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        Resource resource = new ClassPathResource("config.properties");
        configurer.setLocation(resource);
        return configurer;
    }
}
