package com.bookrecommendation.model;

import javax.persistence.*;

@Entity
@Table(name = "trust")
public class Trust {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trustId;
    private int trustorId;
    private int trusteeId;

    // Getters and Setters
}
