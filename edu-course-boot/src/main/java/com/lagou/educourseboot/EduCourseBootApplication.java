package com.lagou.educourseboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.lagou.educourseboot.mapper")
public class EduCourseBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduCourseBootApplication.class, args);
    }
}
