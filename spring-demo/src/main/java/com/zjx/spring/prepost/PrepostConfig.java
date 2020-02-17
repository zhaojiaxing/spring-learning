package com.zjx.spring.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/10 09:51
 */
@Configuration
@ComponentScan("com.zjx.spring.prepost")
public class PrepostConfig {

    /**
     * init 和 destroy均为对应的方法名
     * 此方法指定BeanWayService的init方法在Bean构造后执行，destroy()方法在Bean销毁前执行
     * @return
     */
    @Bean(initMethod = "init",destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

}
