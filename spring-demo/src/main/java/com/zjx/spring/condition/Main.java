package com.zjx.spring.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/02/17 10:46
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService service = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name")+" 系统下的命令为："+
                service.showListCmd());
    }
}
