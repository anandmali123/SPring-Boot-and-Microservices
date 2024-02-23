package com.webclient.Rest.Api.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WElcome {
    @Value("${welcome.msg}")
    private String msg;

    @Value("${welcome.greet}")
    private String greet;

    @GetMapping("/welcome")
    public String welcome() {
        return msg;
    }

    @GetMapping("/greet")
    public String greetm() {

        return greet;
    }
}

