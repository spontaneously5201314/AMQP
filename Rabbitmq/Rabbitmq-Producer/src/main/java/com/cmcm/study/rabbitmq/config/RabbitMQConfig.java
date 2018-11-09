package com.cmcm.study.rabbitmq.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Spontaneously
 * @time 2018-11-08 下午4:35
 */
@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue queue(){
        return new Queue("test", true);
    }

    @Bean
    public TopicExchange exchange(){
        return new TopicExchange("hello");
    }

    @Bean
    public Binding binding(Queue queue, TopicExchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with("hello#");
    }

    @Bean("userQueue")
    public Queue userQueue(){
        return new Queue("user", false);
    }

    @Bean("userExchange")
    public DirectExchange directExchange(){
        return new DirectExchange("user");
    }

    @Bean("userBinding")
    public Binding userBinding(Queue userQueue, DirectExchange userExchange){
        return BindingBuilder.bind(userQueue).to(userExchange).with("user");
    }
}
