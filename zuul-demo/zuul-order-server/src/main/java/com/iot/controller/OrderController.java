package com.iot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-05-22 15:15:21
 */
@RestController
public class OrderController {

    @GetMapping("/order/get")
    public String getOrder() {
        return "调用 getOrder() 获得订单成功！";
    }

}
