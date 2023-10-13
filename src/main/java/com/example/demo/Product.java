package com.example.demo;

import lombok.Builder;
import lombok.Getter;
@Getter
public class Product {
    private int id;
    private String name;
    private String price;
    @Builder
    public Product(int id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
