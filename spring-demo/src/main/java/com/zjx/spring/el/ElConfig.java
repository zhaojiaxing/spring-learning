package com.zjx.spring.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;


/**
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/09 16:40
 */
@Configuration
@ComponentScan("com.zjx.spring.el")
@PropertySource("classpath:el/test.properties")
public class ElConfig {
    /**
     * 注入普通字符
     */
    @Value("this is a normal")
    private String normal;

    /**
     * 注入表达式结果
     */
    @Value("#{ T(java.lang.Math).random()*100.0}")
    private double randomNumber;

    /**
     * 注入系统属性
     */
    @Value("#{systemProperties['os.name']}")
    private String osName;

    /**
     * 注入其他Bean的属性
     */
    @Value("#{demoService.another}")
    private String otherBean;

    /**
     * 注入文件
     */
    @Value("classpath:el/test.txt")
    private Resource testFile;

    /**
     * 注入网址
     */
    @Value("http://www.baidu.com")
    private Resource testUrl;

    /**
     * 注入配置文件信息
     */
    @Value("${book.name}")
    private String bookname;

    @Autowired
    private Environment environment;

    public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(otherBean);
            System.out.println(IOUtils.toString(testFile.getInputStream(),"UTF-8"));
            System.out.println(IOUtils.toString(testUrl.getInputStream(),"UTF-8"));
            System.out.println(bookname);
            System.out.println(environment.getProperty("book.author"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
