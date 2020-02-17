package com.zjx.spring.mvc;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/02/17 16:26
 */
@RestController
public class AdviceController {
    @RequestMapping("/advice")
    public String getSomething(@ModelAttribute("msg") String msg){
        throw new IllegalArgumentException("非常抱歉，参数有误，来自@ModelAttribute："+msg);
    }


}
