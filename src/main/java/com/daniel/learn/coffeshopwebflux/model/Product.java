package com.daniel.learn.coffeshopwebflux.model;

import lombok.Value;
import org.springframework.data.annotation.Id;

@Value
public class Product {

    @Id
    private String id;
    private String name;
    private Double price;
}
