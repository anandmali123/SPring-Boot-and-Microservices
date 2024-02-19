package com.post_request.post_api.rest;

import com.post_request.post_api.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {
    @GetMapping("/products" )
    public ResponseEntity<List<Product>> getproduct(){
        Product p1=new Product(101,1500,"Paneer");
        Product p2=new Product(102,190,"Mouse");
        Product p3=new Product(103,200,"Banyan");

        List<Product> products= Arrays.asList(p1,p2,p3);
        return new ResponseEntity<>(products, HttpStatus.OK);



    }

    @GetMapping(value="/product",produces = {"application/xml"})
    public ResponseEntity<Product> getp(){
        Product product=new Product();
        product.setProductId(1);
        product.setProductPrice(900);
        product.setProductName("Keyboard");

        return new ResponseEntity<>(product,HttpStatus.OK);
    }
}
