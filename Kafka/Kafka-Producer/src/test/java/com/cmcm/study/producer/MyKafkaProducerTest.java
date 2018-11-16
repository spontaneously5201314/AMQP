package com.cmcm.study.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Spontaneously
 * @time 2018-11-12 下午4:14
 */
@RunWith(SpringRunner.class)
public class MyKafkaProducerTest {

    @Autowired
    private MyKafkaProducer myKafkaProducer;

    @Test
    public void sendMessage() throws Exception {
        myKafkaProducer.sendMessage("topic-1", "topic--------1");
        myKafkaProducer.sendMessage("topic-2", "topic--------2");
    }

}