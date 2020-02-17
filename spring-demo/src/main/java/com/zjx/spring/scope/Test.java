package com.zjx.spring.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 演示singleton和prototype，分别从容器中获取两次bean，判断bean实例是否相等
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/09 16:17
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService singletonService = context.getBean(DemoSingletonService.class);
        DemoSingletonService singletonService2 = context.getBean(DemoSingletonService.class);

        DemoPrototypeService prototypeService = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService prototypeService2 = context.getBean(DemoPrototypeService.class);

        System.out.println("singletonService 与 singletonService2是否相等："+singletonService.equals(singletonService2));
        System.out.println("prototypeService 与 prototypeService是否相等："+prototypeService.equals(prototypeService2));
    }
}
