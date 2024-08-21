package com.helloIftekhar.springJwt.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer product_id;
    private String brand;
    private String image_url;
    private Float rating;
    private String title;
    private String category;
    private Integer inventory_count;
    private Double price;
    private String description;
    private String availability;
    private String style;
    private Long total_reviews;
    @OneToMany
    @JoinColumn(name = "product_id")
    @JsonIgnoreProperties("product_id")
    private List<SimilarProducts> similarProducts=new ArrayList<>();
}

