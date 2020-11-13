package com.ethan.rocketmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringbootRocketmqProducer {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootRocketmqProducer.class, args);

        log.info("生产者启动成功");
    }
}
