package com.kafka.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    public String sendMessage(String message){
        kafkaTemplate.send("kafka_producer",message);
        return "message send to consumer is : " + message;
    }

}
