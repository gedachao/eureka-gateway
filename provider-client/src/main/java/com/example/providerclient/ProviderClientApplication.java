package com.example.providerclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderClientApplication.class, args);
    }

}
