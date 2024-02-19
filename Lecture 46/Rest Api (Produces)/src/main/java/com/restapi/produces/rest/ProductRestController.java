package com.restapi.produces.rest;

import com.restapi.produces.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
    @PostMapping(value="/product" ,consumes={"application/xml","application/json"})
    public ResponseEntity<Product> getProduct() {

        Product productObj = new Product();

        productObj.setProductId(101);
        productObj.setProductname("Anand");
        productObj.setProductPrice(1500);

        return new ResponseEntity<>(productObj, HttpStatus.CREATED);


    }




}

