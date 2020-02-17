package com.zjx.spring.profile;

/**
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/10 11:46
 */
public class ProfileBean {

    private String content;

    public ProfileBean(String content){
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
