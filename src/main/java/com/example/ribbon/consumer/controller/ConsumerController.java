package com.example.ribbon.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {


    @Autowired
    RestTemplate restTemplate;



    @RequestMapping(value="/ribbon-consume",method = RequestMethod.GET)
    public String helloConsume(){
        return restTemplate.getForEntity("http://hello-world/index",String.class).getBody();
    }
}
