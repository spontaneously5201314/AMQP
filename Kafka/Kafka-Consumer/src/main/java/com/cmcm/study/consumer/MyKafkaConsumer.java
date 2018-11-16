package com.cmcm.study.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author Spontaneously
 * @time 2018-11-12 下午4:13
 */
@Component
public class MyKafkaConsumer {

    @KafkaListener(topics = {"test"})
    public void testListener(ConsumerRecord<?, ?> record) {

        Optional<?> messages = Optional.ofNullable(record.value());

        if (messages.isPresent()) {
            Object msg = messages.get();
            System.out.println("  this is the testTopic send message: " + msg);
        }
    }
}
