package com.cmcm.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Spontaneously
 * @time 2018-11-12 下午4:54
 */
@RestController
public class KafkaController {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping("/sendMessage/{message}")
    @ResponseBody
    public void sendMessageToKafka(@PathVariable("message") String message) {
        kafkaTemplate.send("test", message).addCallback(
                (result) -> {
                    System.out.println("store successful, and result = " + result);
                }, (ex) -> {
                    System.out.println("store failure, and ex = " + ex);
                }
        );
    }
}
