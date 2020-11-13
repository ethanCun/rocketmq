package com.ethan.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfig
public class SpringbootDubboApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootDubboApplication.class, args);
    }
}
