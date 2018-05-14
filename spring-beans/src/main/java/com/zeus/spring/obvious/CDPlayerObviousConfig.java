package com.zeus.spring.obvious;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xuxingbo
 * @Date 2018/5/8
 */
@Configuration
public class CDPlayerObviousConfig {
    
    @Bean
    public CompactDiscObvious sgtPeppersObvious(){
        return new SgtPeppersObvious();
    }
    
    @Bean
    public CDPlayerObvious cdPlayerObvious(CompactDiscObvious compactDiscObvious){
        return new CDPlayerObvious(compactDiscObvious);
    }
    
    /*
    @Bean
    public CDPlayerObvious cdPlayerObvious(){
        //另外一种注入方式
        return new CDPlayerObvious(sgtPeppersObvious());
    }
    */
}
