package com.cmcm.study.rabbitmq.producer;

import com.cmcm.study.rabbitmq.domain.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Spontaneously
 * @time 2018-11-08 下午4:20
 */
@Component
public class MyProducer {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        for (int i = 0; i < 100; i++) {
            String context = "hello " + i + "----" + new Date();
            System.out.println("send" + context);
            rabbitTemplate.convertAndSend("test", context);
        }
    }

    public void sendTopic() {
        for (int i = 0; i < 100; i++) {
            String context = "hello " + i + "----" + new Date();
            System.out.println("send" + context);
            rabbitTemplate.convertAndSend("hello", "hello#", context);
        }
    }

    public void sendUser(){
        for (int i = 0; i < 100; i++) {
            User user = new User(String.valueOf(i), i);
            System.out.println("send" + user.toString());
            rabbitTemplate.convertAndSend("user", "user", user);
        }
    }

}
