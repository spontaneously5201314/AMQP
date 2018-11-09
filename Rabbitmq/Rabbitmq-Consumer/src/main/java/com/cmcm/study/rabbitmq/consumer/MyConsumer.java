package com.cmcm.study.rabbitmq.consumer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Spontaneously
 * @time 2018-11-08 下午4:20
 */
@Component
@RabbitListener(queues = "test")
public class MyConsumer {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @RabbitHandler
    public void consumer(String conext){
        System.out.println("consumer++++" + conext);
    }
}
