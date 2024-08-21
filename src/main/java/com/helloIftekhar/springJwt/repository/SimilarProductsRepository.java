package com.helloIftekhar.springJwt.repository;

import com.helloIftekhar.springJwt.model.SimilarProducts;

import java.util.ArrayList;

public interface SimilarProductsRepository {
    public ArrayList<SimilarProducts> getSimilarProducts();
    public SimilarProducts addSimilarProducts(SimilarProducts similarProducts);
}
