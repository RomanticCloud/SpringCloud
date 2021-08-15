package com.wang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //在服务启动后，自动注册到Eureka中！
public class DeptProvider1 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider1.class,args);
    }
}
