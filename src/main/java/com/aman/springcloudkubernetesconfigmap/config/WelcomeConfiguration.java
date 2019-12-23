package com.aman.springcloudkubernetesconfigmap.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "welcome")
@Configuration
public class WelcomeConfiguration {

    private String message = "Welcome to home , Aman !";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
