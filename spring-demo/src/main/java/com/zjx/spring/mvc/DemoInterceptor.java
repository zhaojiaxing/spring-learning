package com.zjx.spring.mvc;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.*;

/**
 * 拦截器
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/02/17 15:46
 */
public class DemoInterceptor extends HandlerInterceptorAdapter {
    /**
     * 处理前执行
     *
     * @author: zhaojiaxing
     * @createTime: 2020/02/17 15:56
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        return true;
    }

    /**
     * 在处理后执行
     *
     * @author: zhaojiaxing
     * @createTime: 2020/02/17 15:57
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        long startTime = (Long) request.getAttribute("startTime");
        request.removeAttribute("startTime");
        long endTime = System.currentTimeMillis();
        System.out.println("本次请求处理时间为：" + new Long(endTime - startTime) + " ms");
        request.setAttribute("handLingTime", endTime - startTime);
    }
}
