package com.zjx.spring.config;

/**
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/09 11:42
 */
public class UseFunctionService {

    FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }

    public String sayHello(String word){
        return functionService.sayHello(word);
    }

}
