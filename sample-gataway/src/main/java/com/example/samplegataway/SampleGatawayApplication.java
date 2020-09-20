package com.example.samplegataway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SampleGatawayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleGatawayApplication.class, args);
    }

}
