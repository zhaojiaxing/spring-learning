package com.zjx.spring.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * 自定义注解
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/02/17 11:22
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan
public @interface MyAnnotation {
    String[] value() default {};
}
