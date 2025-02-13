package com.bookrecommendation.repository;

import com.bookrecommendation.model.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecommendationRepository extends JpaRepository<Recommendation, Integer> {
}
