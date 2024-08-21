package com.helloIftekhar.springJwt.service;

import com.helloIftekhar.springJwt.model.SimilarProducts;
import com.helloIftekhar.springJwt.repository.SimilarProductsJpaRespository;
import com.helloIftekhar.springJwt.repository.SimilarProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SimilarProductsService implements SimilarProductsRepository {
    @Autowired
    public SimilarProductsJpaRespository similarProductsJpaRespository;

    @Override
    public ArrayList<SimilarProducts> getSimilarProducts() {
        List<SimilarProducts> similarProductsList = similarProductsJpaRespository.findAll();
        ArrayList<SimilarProducts> similarProductss = new ArrayList<>(similarProductsList);
        return similarProductss;
    }
    @Override
    public SimilarProducts addSimilarProducts(SimilarProducts similarProducts) {
        similarProductsJpaRespository.save(similarProducts);
        return similarProducts;
    }
}
