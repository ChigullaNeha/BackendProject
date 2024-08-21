package com.helloIftekhar.springJwt.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SimilarProducts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String availability;
    private String brand;
    private String description;
    private String image_url;
    private Double price;
    private Float rating;
    private String style;
    private String title;
    private Integer total_reviews;
    private Integer product_id;
}
