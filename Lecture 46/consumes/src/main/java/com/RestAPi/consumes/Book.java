package com.RestAPi.consumes;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "book") // Specify the root element name
@Data
public class Book {

     private Integer id;
     private String name;
     private Double price;
}
