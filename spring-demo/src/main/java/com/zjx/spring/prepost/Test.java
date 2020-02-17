package com.zjx.spring.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Bean的初始化和销毁
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/10 10:08
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrepostConfig.class);
        BeanWayService service = context.getBean(BeanWayService.class);
        JSRWayService jsrWayService = context.getBean(JSRWayService.class);
        context.close();
    }
}
