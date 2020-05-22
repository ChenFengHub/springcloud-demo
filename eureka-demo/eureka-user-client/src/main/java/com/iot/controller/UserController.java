package com.iot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-05-18 10:10:10
 */
@Controller
public class UserController {

    @ResponseBody
    @GetMapping(value = "/user/get")
    private String get(){
        return "测试用户";
    }

}
