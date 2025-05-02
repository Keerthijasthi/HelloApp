package com.example.HelloApp.controller;

import com.example.HelloApp.kafka.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/poc")
public class HelloController {

    @Autowired
    private KafkaProducerService producerService;

    @GetMapping("/")
    public String home() {
        return "Hello World!";
    }

    @PostMapping("/publish")
    public String sendMessage(@RequestBody Map<String, String> request) {
        String message = request.get("message");
        producerService.sendMessage(message);
        return "Message sent to Kafka topic: " + message;
    }
}
