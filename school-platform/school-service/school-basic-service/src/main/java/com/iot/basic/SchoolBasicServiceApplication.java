package com.iot.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SchoolBasicServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolBasicServiceApplication.class, args);
    }

}
