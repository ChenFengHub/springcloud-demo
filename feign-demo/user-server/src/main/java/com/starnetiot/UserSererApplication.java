package com.starnetiot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class UserSererApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserSererApplication.class, args);
    }

}
