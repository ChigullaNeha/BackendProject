package com.example.Project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer user_id;
    private String user_name;
    private String email;
    private String mobile_num;
    private String password;
    private String address;
    private String is_admin;
    private Long zipcode;
    private String city;
    private String state;
}
