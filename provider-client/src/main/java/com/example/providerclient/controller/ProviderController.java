package com.example.providerclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider-client")
public class ProviderController {

    @RequestMapping("/port")
    public String getPort(@Value("${server.port:port-nope}") String port){
        return port;
    }
}
