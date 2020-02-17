package com.zjx.spring.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/10 11:50
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //指定环境
        context.getEnvironment().setActiveProfiles("dev");
        context.register(ProfileConfig.class);
        context.refresh();

        ProfileBean bean = context.getBean(ProfileBean.class);
        System.out.println(bean.getContent());

        context.close();

    }
}
