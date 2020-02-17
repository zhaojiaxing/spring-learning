package com.zjx.spring.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/02/14 17:01
 */
@Service
public class AsyncTaskService {

    /**
     *  @Async 注解表明该方法是一个异步方法，如果注解在类上，则表明该类所有方法都是异步方法。
     *  这里的方法自动被注入使用ThreadPoolTaskExecutor作为TaskExecutor
     * @param i
     * @return:
     * @author: zhaojiaxing
     * @createTime: 2020/02/14 17:07
     */
    @Async
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务："+i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务plus："+i);
    }
}
