package com.ethan.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfig
public class SpringbootDubboConsumerApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootDubboConsumerApplication.class, args);
    }
}
