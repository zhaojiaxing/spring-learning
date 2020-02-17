package com.zjx.spring.config;

import lombok.Builder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/09 11:16
 */
@Configuration
public class JavaConfig {

    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    /**
     * 注入方式一
     * @return:
     * @author: zhaojiaxing
     * @createTime: 2020/01/09 11:46
     */
    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService());
        return useFunctionService;
    }

    /**
     * 注入方式二
     * @param functionService
     * @return:
     * @author: zhaojiaxing
     * @createTime: 2020/01/09 11:46
     */
    @Bean
    public UseFunctionService useFunctionService(FunctionService functionService){
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }
}
