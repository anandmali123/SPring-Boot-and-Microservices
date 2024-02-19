package com.restapi.train_ticket_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainTicketApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainTicketApiApplication.class, args);
        System.err.println("App Started....");
    }
}
