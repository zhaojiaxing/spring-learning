package com.zjx.spring.aop;

import org.springframework.stereotype.Service;

/**
 * 使用注解的拦截类
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/09 15:15
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解拦截的add操作")
    public void add(){ }
}
