package com.cmcm.study.rabbitmq.consumer;

import com.cmcm.study.rabbitmq.domain.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Spontaneously
 * @time 2018-11-09 下午1:20
 */
@Component
@RabbitListener(queues = "user")
public class UserQueueConsumer {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @RabbitHandler
    public void userConsumer(User user){
        System.out.println("收到的user= " + user.toString());
    }
}
