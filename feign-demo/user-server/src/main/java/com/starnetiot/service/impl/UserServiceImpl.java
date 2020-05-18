package com.starnetiot.service.impl;

import com.starnetiot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-05-18 15:15:41
 */
@RestController
public class UserServiceImpl implements IUserService {

    @Override
    public String getUserInfo() {
        return "调用 getUserInfo 接口，获得用户信息";
    }



}
