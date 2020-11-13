package com.ethan.rockermq;

import com.ethan.rocketmq.SpringbootConsumerApplication;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootConsumerApplication.class)
public class SpringbootRocketmqConsumer {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @Test
    public void rocketmqConsumerTest() throws Exception{


    }
}
