package com.iot.feign;

import com.iot.service.IUserService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-05-18 15:15:28
 */
@FeignClient(value = "user-server", fallback = UserFallback.class)
public interface UserServiceFeign extends IUserService {
}
