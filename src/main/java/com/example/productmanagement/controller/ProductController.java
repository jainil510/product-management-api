package com.example.productmanagement.controller;

import com.example.productmanagement.model.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {

    private List<Product> products = new ArrayList<>();

    public ProductController() {
        products.add(new Product(1, "MacBook Air", 999.99));
        products.add(new Product(2, "iPhone 15", 799.99));
        products.add(new Product(3, "AirPods Pro", 249.99));
    }

    @GetMapping("/hello")
    public String hello() {
        return "Product API is running";
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        products.add(product);
        return product;
    }

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return products;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}
