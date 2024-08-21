package com.helloIftekhar.springJwt.repository;

import com.helloIftekhar.springJwt.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductJpaRepository extends JpaRepository<Product, Integer> {
    List<Product> findByBrand(String brand);
}
