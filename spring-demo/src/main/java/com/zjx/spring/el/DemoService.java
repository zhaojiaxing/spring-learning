package com.zjx.spring.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 需要被注入的bean
 * 这里是注入普通的字符
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/09 16:37
 */
@Service
public class DemoService {
    @Value("我是注入的bean的属性")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
