package com.helloIftekhar.springJwt.repository;

import com.helloIftekhar.springJwt.model.SimilarProducts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SimilarProductsJpaRespository extends JpaRepository<SimilarProducts, Integer> {
}
