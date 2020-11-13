package com.ethan.rocketmq.listener;

import org.apache.rocketmq.spring.annotation.ConsumeMode;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

//消息消费监听器 需要注册到spring
@Component
//参数1： 主题 参数2：消费方式 参数3：组名
@RocketMQMessageListener(topic = "springboot-rocketmq-topic",
        consumeMode = ConsumeMode.CONCURRENTLY,
        consumerGroup = "springboot-rocketmq-group")
public class Consumer implements RocketMQListener<String> {

    @Override
    public void onMessage(String s) {

        System.out.println("消息： " + s);
    }
}
