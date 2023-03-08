package com.devmind.annotation.springapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {
    @Bean
    public TipsAndTricksService tipsAndTricksService() {
        return new TipsAndTricksService();
    }
}
