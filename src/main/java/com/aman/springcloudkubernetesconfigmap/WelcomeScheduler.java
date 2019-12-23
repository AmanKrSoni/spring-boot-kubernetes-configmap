package com.aman.springcloudkubernetesconfigmap;

import com.aman.springcloudkubernetesconfigmap.config.WelcomeConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class WelcomeScheduler {

    private static final Logger logger = LoggerFactory.getLogger(WelcomeScheduler.class);

    @Autowired
    private WelcomeConfiguration configuration;

    @Scheduled(fixedDelay = 3000)
    public void scheduler(){
        logger.info("scheduler msg : {}", configuration.getMessage());
    }
}
