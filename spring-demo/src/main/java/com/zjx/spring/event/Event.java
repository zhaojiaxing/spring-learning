package com.zjx.spring.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 事件
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/11 10:46
 */
public class Event extends ApplicationEvent {

    private String msg;

    public Event(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
