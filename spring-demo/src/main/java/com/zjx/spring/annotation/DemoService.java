package com.zjx.spring.annotation;

import org.springframework.stereotype.Service;

/**
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/02/17 11:26
 */
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("从组合注解配置照样获得了bean");
    }
}
