package com.bookrecommendation.model;

import javax.persistence.*;

@Entity
@Table(name = "recommendations")
public class Recommendation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recommendationId;
    private int userId;
    private int bookId;
    private float predictedRating;

    // Getters and Setters
}
