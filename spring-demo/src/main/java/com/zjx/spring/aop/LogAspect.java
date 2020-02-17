package com.zjx.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/09 15:22
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.zjx.spring.aop.Action)")
    public void annotationPointCut(){};

    /**
     *  拦截注解
     * @param joinPoint
     * @return:
     * @author: zhaojiaxing
     * @createTime: 2020/01/09 15:49
     */
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        //利用反射获取方法
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截 "+action.name());
    }

    /**
     * 方法规则式拦截
     * @param joinPoint
     * @return:
     * @author: zhaojiaxing
     * @createTime: 2020/01/09 15:50
     */
    @Before("execution(* com.zjx.spring.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截，"+method.getName());
    }
}
