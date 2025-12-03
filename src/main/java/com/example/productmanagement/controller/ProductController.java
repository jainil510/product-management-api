package com.example.productmanagement.controller;

import com.example.productmanagement.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/hello")
    public String hello(){
        return "Product API is running";
    }

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "MacBook Air", 999.99));
        products.add(new Product(2, "iPhone 15", 799.99));
        products.add(new Product(3, "AirPods Pro", 249.99));

        return products;
    }


}
