package com.bookrecommendation.model;

import javax.persistence.*;

@Entity
@Table(name = "ratings")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ratingId;
    private int userId;
    private int bookId;
    private int ratingValue;

    // Getters and Setters
}
