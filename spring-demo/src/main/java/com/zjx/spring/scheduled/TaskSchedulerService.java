package com.zjx.spring.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/02/14 17:25
 */
@Service
public class TaskSchedulerService {

    /**
     * @Scheduled注解开启对计划任务的支持
     * cron="0/5 * * * * ? " 表示每隔5秒执行一次
     * @return:
     * @author: zhaojiaxing
     * @createTime: 2020/02/14 17:28
     */
    @Scheduled(cron="0/5 * * * * ? ")
    public void fixTimeExcution(){
        System.out.println("在指定时间 "+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) +" 执行");
    }
}
