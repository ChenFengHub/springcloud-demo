package com.iot.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-05-26 09:09:59
 */
@FeignClient(value = "member-server", fallback = MemberFeignFallback.class)
public interface MemberFeign {

    // 如果 MemberController 会员服务接口抽象成接口（interface），这里就不需要重新写了，
    // 直接实现接口即可。当有很多服务都要通过 feign 调用会员服务接口，抽象成接口就很有意义
    @GetMapping("/member/get")
    String getMember();

}
