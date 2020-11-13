package com.ethan.rocketmq;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootRocketmqProducer.class)
public class SpringbootRockermqProducer {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @Test
    public void producerTest() throws Exception{

        this.rocketMQTemplate.convertAndSend("springboot-rocketmq-topic",
                "springboot集成rocketmq发送消息");
    }
}
