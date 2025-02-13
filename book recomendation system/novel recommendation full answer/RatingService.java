package com.bookrecommendation.service;

import com.bookrecommendation.model.Rating;
import com.bookrecommendation.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingService {
    @Autowired
    private RatingRepository ratingRepository;

    public void save(Rating rating) {
        ratingRepository.save(rating); // Saves the rating to the database
    }
}
