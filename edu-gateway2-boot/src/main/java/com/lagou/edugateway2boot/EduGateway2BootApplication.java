package com.lagou.edugateway2boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EduGateway2BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduGateway2BootApplication.class, args);
    }

}
