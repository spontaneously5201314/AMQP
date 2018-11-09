package com.cmcm.study.rabbitmq.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqProducerApplicationTests {

    @Autowired
    private MyProducer myProducer;

    @Test
    public void contextLoads() {
//        myProducer.send();
        myProducer.sendTopic();
        myProducer.sendUser();
    }

}
