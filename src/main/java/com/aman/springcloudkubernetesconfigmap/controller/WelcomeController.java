package com.aman.springcloudkubernetesconfigmap.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);
    @Value("${message:Welcome to controller ..}")
    private String message;

    @GetMapping
    public String welcomeMsg(){
        logger.info("Welcome controller msg : {}", message);
        return message;
    }
}
