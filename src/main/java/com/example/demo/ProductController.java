package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/product")
    public ResponseEntity<?> productList() {
        System.out.println("/product 요청됨");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "apple", "1,000원"));
        productList.add(new Product(2, "orange", "2,000원"));
        productList.add(new Product(3, "pear", "3,000원"));

        return ResponseEntity.ok().body(productList);
    }
    @GetMapping("/product/1")
    public ResponseEntity<?> product() {
        System.out.println("/product/1 요청됨");
        return ResponseEntity.ok().body(new Product(1, "apple", "1,000원"));
    }
}
