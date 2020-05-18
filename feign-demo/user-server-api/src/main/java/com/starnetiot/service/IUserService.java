package com.starnetiot.service;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-05-18 15:15:17
 */
public interface IUserService {

    @GetMapping(value = "/user/get")
    String getUserInfo();

}
