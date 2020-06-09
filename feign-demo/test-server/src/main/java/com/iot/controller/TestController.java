package com.iot.controller;

import com.iot.entity.UserSearchParam;
import com.iot.feign.UserServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-05-18 16:16:12
 */
@RestController
public class TestController {

    @Autowired
    private UserServiceFeign userServiceFeign;

    @GetMapping("/test")
    public String test() {
        UserSearchParam param = new UserSearchParam();
        param.setNickName("cf");
        param.setTelephone("10086");
        String res = userServiceFeign.getUserInfo(param);
        return res;
    }
}
