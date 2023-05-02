package com.training.docker.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Value("${user.service.url}")
    private String userServiceUrl;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public UserServiceClient userServiceClient(RestTemplate restTemplate) {
        return new UserServiceClient(restTemplate, userServiceUrl);
    }

}
