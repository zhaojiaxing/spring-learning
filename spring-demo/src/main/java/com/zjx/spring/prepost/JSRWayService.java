package com.zjx.spring.prepost;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 注解形式进行Bean的初始化和销毁
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/10 10:13
 */
@Component
public class JSRWayService {
    /**
     * Bean的初始化
     */
    @PostConstruct
    public void init(){
        System.out.println("this is Bean init by JSR.");
    }

    /**
     * Bean的销毁
     */
    @PreDestroy
    public void destroy(){
        System.out.println("this is Bean destroy by JSR.");
    }
}
