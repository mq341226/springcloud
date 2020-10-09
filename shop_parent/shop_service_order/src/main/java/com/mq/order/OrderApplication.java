package com.mq.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }

    /**
     * 向容器注入RestTemplate
     */
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
