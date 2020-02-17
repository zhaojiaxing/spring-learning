package com.zjx.spring.async;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/02/14 17:09
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
       for(int i = 0; i < 10;i++){
           asyncTaskService.executeAsyncTask(i);
           asyncTaskService.executeAsyncTaskPlus(i);
       }
        context.close();
    }
}
