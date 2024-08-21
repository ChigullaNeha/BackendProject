package com.helloIftekhar.springJwt.repository;

import com.helloIftekhar.springJwt.model.Product;

import java.util.ArrayList;

public interface ProductRepository {
    public ArrayList<Product> getProducts();
    public Product getProductById(int product_id);
    public Product addProducts(Product product);
    public Product updateProducts(int product_id, Product product);
    public String deleteProductById(int product_id);
}
