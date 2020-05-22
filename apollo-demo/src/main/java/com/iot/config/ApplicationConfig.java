package com.iot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @program: springcloud-demo
 * @description: 类功能描述
 * @author: Mr.CF
 * @create: 2020-05-19 19:19:11
 */

@Data
@Component
public class ApplicationConfig {

    @Value("${apollo.host:default}")
    private String apolloHost;

}
