package com.zjx.spring.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/11 11:43
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        Publisher publisher = context.getBean(Publisher.class);
        publisher.publish("我发布了一个事件");
        context.close();
    }
}
