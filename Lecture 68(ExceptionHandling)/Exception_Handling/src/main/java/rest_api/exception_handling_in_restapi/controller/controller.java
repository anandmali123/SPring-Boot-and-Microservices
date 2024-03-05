package rest_api.exception_handling_in_restapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rest_api.exception_handling_in_restapi.ExceptionInf;

@RestController
public class controller {



    private Logger logger = LoggerFactory.getLogger(controller.class);
@GetMapping("/")
    public String doAction() {
        String msg = "Action In Progress";

        try {
            int i = 10 / 0;
        } catch (Exception e) {
            logger.error("Exception Occured:: " + e, e);
            throw new ArithmeticException(e.getMessage());
        }
        return msg;
    }



}
