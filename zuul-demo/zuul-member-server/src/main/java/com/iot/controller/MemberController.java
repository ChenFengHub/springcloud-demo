package com.iot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-05-22 15:15:13
 */
@RestController
public class MemberController {

    @GetMapping("/member/get")
    public String getMember() {
        return "调用 getMember() 获得会员信息成功！";
    }

}
