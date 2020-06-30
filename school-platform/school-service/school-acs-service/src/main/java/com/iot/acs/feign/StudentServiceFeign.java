package com.iot.acs.feign;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-06-29 20:20:18
 */

import com.iot.basic.service.IStudentService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "school-basic-server", fallback = StudentServiceFallback.class)
public interface StudentServiceFeign extends IStudentService {
}
