package com.iot.feign;

import org.springframework.stereotype.Component;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-05-26 10:10:02
 */
@Component
public class MemberFeignFallback implements MemberFeign {
    @Override
    public String getMember() {
        return "网络繁忙，获取会员信息失败！";
    }
}
