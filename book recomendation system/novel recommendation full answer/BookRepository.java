package com.bookrecommendation.repository;

import com.bookrecommendation.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
