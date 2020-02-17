package com.zjx.spring.condition;

/**
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/02/17 10:37
 */
public class LinuxListService implements ListService{

    @Override
    public String showListCmd() {
        return "ls";
    }
}
