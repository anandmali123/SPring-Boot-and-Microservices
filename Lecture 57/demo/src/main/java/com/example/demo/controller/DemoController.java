package com.example.demo.controller;

import com.example.demo.mapper.ApplicationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@RestController
public class DemoController {
    @Autowired
    private ApplicationProperties props;

    @GetMapping("/welcome")
    public String welcomeMsg(){
        Map<String, String> messages=props.getMessages();
        String value=messages.get("welcomeMsg");
        return value;
    }

    @GetMapping("/greet")
    public String greetMsg(){
        Map<String,String> messages=props.getMessages();
        String value=messages.get("greetMsg");

        return value;
    }

    @GetMapping("/wish")
    public String getWish(){
        return props.getMessages().get("wishMsg");
    }
}
