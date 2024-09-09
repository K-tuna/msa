package com.example.orderservice.messagequeue;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "order-topic", groupId = "order-group")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
}

