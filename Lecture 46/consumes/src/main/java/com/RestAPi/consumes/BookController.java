package com.RestAPi.consumes;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @PostMapping(value="/book", consumes = MediaType.APPLICATION_XML_VALUE)

    public ResponseEntity<String> addBook(@RequestBody Book book){
        System.out.println(book);
        String msg="Book added successfully";

        return new ResponseEntity<String>(msg, HttpStatus.CREATED);
    }
}

