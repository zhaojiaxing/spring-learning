package com.zjx.spring.aop;

import java.lang.annotation.*;

/**
 * 拦截规则的注解
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/09 15:09
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
