package com.post_request.post_api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data

@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Integer ProductId;
    private Integer ProductPrice;
    private String ProductName;
}


