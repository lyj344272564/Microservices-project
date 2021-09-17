package com.lagou.eduuserboot;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.lagou.eduuserboot.mapper")
public class EduUserBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduUserBootApplication.class, args);
    }

}
