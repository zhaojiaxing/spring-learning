package com.zjx.spring.scheduled;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/02/14 17:24
 */
@Configuration
@ComponentScan("com.zjx.spring.scheduled")
@EnableScheduling
public class TaskSchedulerConfig {

}
