package com.bookrecommendation.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String username;
    private String password;
    private String email;
    private int age;
    private String location;

    // Getters and Setters
}
