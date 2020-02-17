package com.zjx.spring.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/10 11:47
 */
@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public ProfileBean dev(){
        return new ProfileBean("from dev");
    }

    @Bean
    @Profile("prod")
    public ProfileBean prod(){
        return new ProfileBean("from prod");
    }

}
