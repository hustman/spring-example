package com.zeus.spring.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author xuxingbo
 * @Date 2018/5/10
 */
@Configuration
public class ProfileConfig {
    
    @Bean
    @Profile("dev")
    public ProfileModel getDevProfile(){
        return new ProfileModel("dev", 1);
    }
    
    @Bean
    @Profile("beta")
    public ProfileModel getBetaProfile(){
        return new ProfileModel("beta", 1);
    }
}
