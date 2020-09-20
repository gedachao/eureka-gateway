package com.example.consumeclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consume-client")
public class CallController {
    private static final String PROVIDER_CLIENT_URI = "http://provider-client";
    private static final String GATEWAY_URI = "http://sample-gateway";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/port")
    public String getPort(){
        String res = restTemplate.getForObject(PROVIDER_CLIENT_URI + "/provider-client/port", String.class);
        return res;
    }

    @RequestMapping("/portByGate")
    public String getPortByGate(){
        String res = restTemplate.getForObject(GATEWAY_URI + "/provider-client/port", String.class);
        return res;
    }

}
