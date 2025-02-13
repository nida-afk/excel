package com.bookrecommendation.repository;

import com.bookrecommendation.model.Trust;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrustRepository extends JpaRepository<Trust, Integer> {
}
