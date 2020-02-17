package com.zjx.spring.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 依赖注入
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/03 15:15
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("di"));
        context.close();
    }
}
