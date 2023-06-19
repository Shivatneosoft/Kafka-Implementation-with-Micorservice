package com.kafka.producer.controller;

import com.kafka.producer.service.ProducerService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @GetMapping("/producer")
    public String sendMessage(@PathParam("message") String message){
        return this.producerService.sendMessage(message);
    }

}
