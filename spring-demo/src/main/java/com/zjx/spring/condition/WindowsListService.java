package com.zjx.spring.condition;

import org.springframework.stereotype.Service;


/**
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/02/17 10:34
 */
@Service
public class WindowsListService implements ListService {

    @Override
    public String showListCmd() {
        return "dir";
    }
}
