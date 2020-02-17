package com.zjx.spring.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * prototype的Bean
 * @author zhaojiaxing
 * @version 1.0
 * @Date 2020/01/09 16:15
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
