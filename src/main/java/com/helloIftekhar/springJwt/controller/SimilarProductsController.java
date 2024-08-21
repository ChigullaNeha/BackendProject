package com.helloIftekhar.springJwt.controller;

import com.helloIftekhar.springJwt.model.SimilarProducts;
import com.helloIftekhar.springJwt.service.SimilarProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class SimilarProductsController {
    @Autowired
    public SimilarProductsService similarProductsService;
    @GetMapping("/similarproducts")
    public ArrayList<SimilarProducts> getSimilarProducts() {
        return similarProductsService.getSimilarProducts();
    }
    @PostMapping("/similarproducts")
    public SimilarProducts addSimilarProducts(@RequestBody SimilarProducts similarProducts) {
        return similarProductsService.addSimilarProducts(similarProducts);
    }
}
