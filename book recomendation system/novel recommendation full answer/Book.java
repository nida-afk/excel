package com.bookrecommendation.model;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    private String title;
    private String author;
    private String genre;
    private String isbn;
    private String publisher;
    private int yop;
    private String image;

    // Getters and Setters
}
