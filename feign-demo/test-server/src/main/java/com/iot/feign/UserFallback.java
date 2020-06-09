package com.iot.feign;

import com.iot.entity.UserSearchParam;
import org.springframework.stereotype.Component;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-05-18 15:15:30
 */
@Component
public class UserFallback implements UserServiceFeign {
    @Override
    public String getUserInfo(UserSearchParam param) {
        System.out.println("人员信息不存在！");
        return "人员信息不存在！";
    }
}
