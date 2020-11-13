package com.ethan.rocketmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringbootConsumerApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootConsumerApplication.class, args);

        log.info("消费者启动成功");
    }
}
