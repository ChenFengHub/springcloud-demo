package com.iot.service;

import com.iot.entity.UserSearchParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-05-18 15:15:17
 */
public interface IUserService {

    @PostMapping(value = "/user/get")
    String getUserInfo(@RequestBody UserSearchParam param);

}
