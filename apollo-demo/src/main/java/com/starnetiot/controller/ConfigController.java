package com.starnetiot.controller;

import com.starnetiot.config.ApplicationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-05-19 19:19:15
 */
@RestController
public class ConfigController {

    @Autowired
    private ApplicationConfig applicationConfig;

    @GetMapping("/config/get")
    public String getConfigValue() {
        return applicationConfig.getApolloHost();
    }

}
