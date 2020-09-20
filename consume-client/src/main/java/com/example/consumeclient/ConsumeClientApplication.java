package com.example.consumeclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConsumeClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumeClientApplication.class, args);
    }

}
