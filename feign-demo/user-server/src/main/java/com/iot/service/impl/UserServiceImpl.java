package com.iot.service.impl;

import com.iot.entity.UserSearchParam;
import com.iot.service.IUserService;
import org.springframework.web.bind.annotation.RequestBody;
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
    public String getUserInfo(@RequestBody UserSearchParam param) {
        return "调用 getUserInfo 接口，获得用户信息。昵称："
                + param.getNickName() + "电话：" + param.getTelephone();
    }

}
