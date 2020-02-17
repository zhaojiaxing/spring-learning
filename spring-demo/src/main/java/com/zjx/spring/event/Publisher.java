package com.zjx.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 使用容器发布事件
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/11 11:36
 */
@Component
public class Publisher {

    /**
     * 注入ApplicationContext用来发布事件
     */
    @Autowired
    ApplicationContext applicationContext;

    /**
     * 使用ApplicationContext的publishEvent方法来发布
     * @param msg
     */
    public void publish(String msg){
        applicationContext.publishEvent(new Event(this,msg));
    }
}
