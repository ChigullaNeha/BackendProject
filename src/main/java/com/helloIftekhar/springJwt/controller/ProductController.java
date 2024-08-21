package com.helloIftekhar.springJwt.controller;

import com.helloIftekhar.springJwt.model.Product;
import com.helloIftekhar.springJwt.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ProductController {
    @Autowired
    public ProductService productService;

    @GetMapping("/products")
    public ArrayList<Product> getProducts() {
        return productService.getProducts();
    }
    @PostMapping("/products")
    public Product addProducts(@RequestBody Product product) {
        return productService.addProducts(product);
    }
    @PutMapping("/products/{product_id}")
    public Product updateProducts(@PathVariable("product_id") int product_id, @RequestBody Product product) {
        return productService.updateProducts(product_id, product);
    }
    @DeleteMapping("/products/{product_id}")
    public String deleteProductById(@PathVariable("product_id") int product_id) {
        return productService.deleteProductById(product_id);
    }
    @GetMapping("/products/{product_id}")
    public Product getProductById(@PathVariable("product_id") int product_id) {
        return productService.getProductById(product_id);
    }
}
