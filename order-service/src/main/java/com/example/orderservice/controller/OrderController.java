package com.example.orderservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order-service")
@Slf4j
public class OrderController {

    @GetMapping("/orders")
    public String getOrders() {
        return "Hello, Order!";
    }
}
