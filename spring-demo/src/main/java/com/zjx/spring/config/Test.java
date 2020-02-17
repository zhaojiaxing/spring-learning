package com.zjx.spring.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * java配置
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/09 11:46
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("java config"));
        context.close();
    }
}
