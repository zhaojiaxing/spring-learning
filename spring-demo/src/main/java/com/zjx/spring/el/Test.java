package com.zjx.spring.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * el表达式
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/09 16:59
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig elConfig = context.getBean(ElConfig.class);
        elConfig.outputResource();
        context.close();
    }
}
