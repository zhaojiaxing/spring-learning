package com.zjx.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * AOP
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/09 15:36
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }
}
