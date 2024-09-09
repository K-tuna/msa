package com.example.userservice.controller;

import com.example.userservice.messagequeue.KafkaProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-service")
@Slf4j
public class UserController {

    private final KafkaProducerService kafkaProducerService;

    public UserController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @GetMapping("/sendOrder")
    public String sendMessageToKafka(@RequestParam String message) {
        kafkaProducerService.sendMessage(message);
        return "Message sent to order-service!";
    }

    @GetMapping("/users")
    public String getUsers() {
        return "Hello, User!";
    }


}
