package com.zjx.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/09 15:34
 */
@Configuration
@ComponentScan("com.zjx.spring.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
