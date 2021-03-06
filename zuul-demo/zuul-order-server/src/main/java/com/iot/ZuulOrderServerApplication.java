package com.iot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ZuulOrderServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulOrderServerApplication.class, args);
    }

}
