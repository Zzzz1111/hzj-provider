package com.huzijun.hzjprovider.provider.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

public class RabbitConsumer {
    @RabbitListener(queues = "#{rabbitConfiguration.TOPIC_QUEUE}")
    public void sayHello(String content){
        System.out.println(content);
    }
}
