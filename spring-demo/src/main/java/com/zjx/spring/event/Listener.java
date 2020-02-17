package com.zjx.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听器
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/11 11:32
 */
@Component
public class Listener implements ApplicationListener<Event> {
    /**
     * 对消息进行处理
     * @param event
     */
    @Override
    public void onApplicationEvent(Event event) {
        String msg = event.getMsg();
        System.out.println("我接收到了来自发送者发送的消息："+msg);
    }
}
