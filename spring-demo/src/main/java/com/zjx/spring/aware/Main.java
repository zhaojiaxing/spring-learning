package com.zjx.spring.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/02/14 16:16
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareTest awareTest = context.getBean(AwareTest.class);
        awareTest.outputResult();
        context.close();
    }
}
