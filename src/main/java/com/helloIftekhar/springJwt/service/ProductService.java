package com.helloIftekhar.springJwt.service;

import com.helloIftekhar.springJwt.model.Product;
import com.helloIftekhar.springJwt.repository.ProductJpaRepository;
import com.helloIftekhar.springJwt.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService implements ProductRepository {
    @Autowired
    public ProductJpaRepository productJpaRepository;
    @Override
    public ArrayList<Product> getProducts() {
        List<Product> productList = productJpaRepository.findAll();
        ArrayList<Product> products = new ArrayList<>(productList);
        return products;
    }

    @Override
    public Product addProducts(Product product) {
        List<Product> existingProducts = productJpaRepository.findByBrand(product.getBrand());
        if (!existingProducts.isEmpty()) {
            int maxInventoryCount = existingProducts.stream()
                    .mapToInt(Product::getInventory_count)
                    .max()
                    .orElse(0);

            // Step 3: Set the new product's inventory count based on the maximum found
            product.setInventory_count(maxInventoryCount + product.getInventory_count());
//        List<Product> existingProducts = productJpaRepository.findByBrand(product.getBrand());
//        if (!existingProducts.isEmpty()) {
//            // Handle case where multiple products are returned
//            Product existingProduct = existingProducts.get(0); // or handle as needed
//            existingProduct.setInventory_count(existingProduct.getInventory_count() + product.getInventory_count());
//            return productJpaRepository.save(existingProduct);
//        } else {
//            return productJpaRepository.save(product);
//        }
        }
        productJpaRepository.save(product);
        return product;
    }
    @Override
    public Product updateProducts(int product_id,Product product) {
        Product newProduct = productJpaRepository.findById(product_id).get();
        if(newProduct.getBrand() != null) {
            newProduct.setBrand(product.getBrand());
        } else if(newProduct.getAvailability() != null) {
            newProduct.setAvailability(product.getAvailability());
        } else if(newProduct.getInventory_count() != null) {
            newProduct.setInventory_count(product.getInventory_count());
        } else if(newProduct.getCategory() != null) {
            newProduct.setCategory(product.getCategory());
        } else if(newProduct.getImage_url() != null) {
            newProduct.setImage_url(product.getImage_url());
        } else if(newProduct.getPrice() != null) {
            newProduct.setPrice(product.getPrice());
        } else if(newProduct.getRating() != null) {
            newProduct.setPrice(product.getPrice());
        } else if(newProduct.getStyle() != null) {
            newProduct.setPrice(product.getPrice());
        } else if(newProduct.getDescription() != null) {
            newProduct.setDescription(product.getDescription());
        } else if(newProduct.getTitle() != null) {
            newProduct.setTitle(product.getTitle());
        } else if(newProduct.getTotal_reviews() != null) {
            newProduct.setTotal_reviews(product.getTotal_reviews());
        }
        productJpaRepository.save(newProduct);
        return newProduct;
    }
    @Override
    public String deleteProductById(int product_id) {
        productJpaRepository.deleteById(product_id);
        return "product deleted successfully";
    }
    @Override
    public Product getProductById(int product_id) {
        return productJpaRepository.findById(product_id).get();
    }
}
