package com.kafka.consumer.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerController {

    @KafkaListener(topics = "kafka_producer", groupId = "ankit_group")
    public void receviedMessage(String message){
        System.out.println("the recieved message is " + message);
    }

}
