package com.zjx.spring.prepost;

/**
 * 使用java配置方式实现Bean的初始化和销毁
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/10 09:48
 */
public class BeanWayService {

    /**
     * Bean的初始化
     */
    public void init(){
        System.out.println("this is Bean init.");
    }

    /**
     * Bean的销毁
     */
    public void destroy(){
        System.out.println("this is Bean destroy");
    }
}
