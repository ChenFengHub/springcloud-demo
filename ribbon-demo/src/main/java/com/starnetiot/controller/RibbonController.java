package com.starnetiot.controller;

import com.starnetiot.ribbon.MyRibbon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-05-18 09:09:55
 */
@Controller
public class RibbonController {

    @Autowired
    private MyRibbon myRibbon;

    @ResponseBody
    @GetMapping(value = "/ribbon/test")
    public String ribbonMember() {
        // 1.获取服务名称对应服务列表
        String res = myRibbon.ribbonGet("user-server", "/user/get");
        return res;
    }
}
