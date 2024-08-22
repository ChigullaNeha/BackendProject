package com.helloIftekhar.springJwt.model;
import jakarta.persistence.*;

@Entity
@Table(name = "similarProducts")
public class SimilarProducts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "availability")
    private String availability;
    @Column(name = "brand")
    private String brand;

    @Column(name = "image_url")
    private String image_url;
    @Column(name = "price")
    private Double price;
    @Column(name = "rating")
    private Float rating;
    @Column(name = "style")
    private String style;
    @Column(name = "title")
    private String title;
    @Column(name = "total_reviews")
    private Integer total_reviews;
    @Column(name = "product_id")
    private Integer product_id;

    public SimilarProducts() {
    }

    public SimilarProducts(Integer id, String availability, String brand , String image_url, Double price, Float rating, String style, String title, Integer total_reviews, Integer product_id) {
        this.id = id;
        this.availability = availability;
        this.brand = brand;
        this.image_url = image_url;
        this.price = price;
        this.rating = rating;
        this.style = style;
        this.title = title;
        this.total_reviews = total_reviews;
        this.product_id = product_id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTotal_reviews(Integer total_reviews) {
        this.total_reviews = total_reviews;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getId() {
        return id;
    }

    public String getAvailability() {
        return availability;
    }

    public String getBrand() {
        return brand;
    }

    public String getImage_url() {
        return image_url;
    }

    public Double getPrice() {
        return price;
    }

    public Float getRating() {
        return rating;
    }

    public String getStyle() {
        return style;
    }

    public String getTitle() {
        return title;
    }

    public Integer getTotal_reviews() {
        return total_reviews;
    }

    public Integer getProduct_id() {
        return product_id;
    }
}
