package com.helloIftekhar.springJwt.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "brand")
    private String brand;
    @Column(name = "image_url")
    private String image_url;
    @Column(name = "rating")
    private Float rating;
    @Column(name = "title")
    private String title;
    @Column(name = "category")
    private String category;
    @Column(name = "inventory_count")
    private Integer inventory_count;
    @Column(name = "price")
    private Double price;
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
    @Column(name = "availability")
    private String availability;
    @Column(name = "style")
    private String style;
    @Column(name = "total_reviews")
    private Long total_reviews;
    @OneToMany
    @JoinColumn(name = "product_id")
    @JsonIgnoreProperties("product_id")
    private List<SimilarProducts> similarProducts=new ArrayList<>();

    public Product() {
    }

    public Product(Integer id, String brand, String image_url, Float rating, String title, String category, Integer inventory_count, Double price, String description, String availability, String style, Long total_reviews, List<SimilarProducts> similarProducts) {
        this.id = id;
        this.brand = brand;
        this.image_url = image_url;
        this.rating = rating;
        this.title = title;
        this.category = category;
        this.inventory_count = inventory_count;
        this.price = price;
        this.description = description;
        this.availability = availability;
        this.style = style;
        this.total_reviews = total_reviews;
        this.similarProducts = similarProducts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public String getImage_url() {
        return image_url;
    }

    public Float getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public Integer getInventory_count() {
        return inventory_count;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getAvailability() {
        return availability;
    }

    public String getStyle() {
        return style;
    }

    public Long getTotal_reviews() {
        return total_reviews;
    }

    public List<SimilarProducts> getSimilarProducts() {
        return similarProducts;
    }



    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setInventory_count(Integer inventory_count) {
        this.inventory_count = inventory_count;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setTotal_reviews(Long total_reviews) {
        this.total_reviews = total_reviews;
    }

    public void setSimilarProducts(List<SimilarProducts> similarProducts) {
        this.similarProducts = similarProducts;
    }
}

