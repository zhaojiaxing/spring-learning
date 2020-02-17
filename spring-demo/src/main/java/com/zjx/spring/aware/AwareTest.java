package com.zjx.spring.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/02/14 16:06
 */
@Service
public class AwareTest implements BeanNameAware, ResourceLoaderAware {

    private String beanName;

    private ResourceLoader loader;

    @Override
    public void setBeanName(String s) {

        this.beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void outputResult(){
        System.out.println("Bean的名称为："+beanName);
        Resource resource = loader.getResource("classpath:test.txt");
        try {
            System.out.println("加载的文件内容为："+ IOUtils.toString(resource.getInputStream(),"UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
