package com.bookrecommendation.repository;

import com.bookrecommendation.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Integer> {
}
