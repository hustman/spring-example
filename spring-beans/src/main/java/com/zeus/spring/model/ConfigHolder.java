package com.zeus.spring.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author xuxingbo
 * @Date 2018/5/10
 */
@Component
public class ConfigHolder {
    
    @Value("${test.key}")
    private String key;
    
    @Value("${test.value}")
    private String value;
    
    public String get(){
        return "key=" + key + ", value=" + value;
    }
}
