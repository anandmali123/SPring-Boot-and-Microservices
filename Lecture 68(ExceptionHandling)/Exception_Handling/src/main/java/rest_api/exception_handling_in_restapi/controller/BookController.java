package rest_api.exception_handling_in_restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import rest_api.exception_handling_in_restapi.NoDataFoundException;

@RestController
public class BookController {
    @GetMapping("/price/{isbn}")
    public String getPrice(@PathVariable String isbn){
        String msg="";

        if(isbn.equals("ISBN001")){
            msg="Book Price is $400";
        }else{
            throw new NoDataFoundException("Invalid ISBN");
        }
        return msg;
    }
}
