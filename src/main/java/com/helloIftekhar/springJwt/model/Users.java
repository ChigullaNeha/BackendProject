package com.helloIftekhar.springJwt.model;
import jakarta.persistence.*;

@Entity
@Table(name = "userr")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer user_id;
    @Column(name = "user_name")
    private String user_name;
    @Column(name = "email")
    private String email;
    @Column(name = "mobile_num")
    private String mobile_num;
    @Column(name = "password")
    private String password;
    @Column(name = "address")
    private String address;
    @Column(name = "is_admin")
    private String is_admin;
    @Column(name = "zipcode")
    private Long zipcode;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;

    public Users(Integer user_id, String user_name, String email, String mobile_num, String password, String address, String is_admin, Long zipcode, String city, String state) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.email = email;
        this.mobile_num = mobile_num;
        this.password = password;
        this.address = address;
        this.is_admin = is_admin;
        this.zipcode = zipcode;
        this.city = city;
        this.state = state;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile_num(String mobile_num) {
        this.mobile_num = mobile_num;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setIs_admin(String is_admin) {
        this.is_admin = is_admin;
    }

    public void setZipcode(Long zipcode) {
        this.zipcode = zipcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile_num() {
        return mobile_num;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getIs_admin() {
        return is_admin;
    }

    public Long getZipcode() {
        return zipcode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}
