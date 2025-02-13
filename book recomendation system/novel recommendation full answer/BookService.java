package com.bookrecommendation.service;

import com.bookrecommendation.model.Book;
import com.bookrecommendation.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public void addBook(Book book) {
        bookRepository.save(book); // Saves the book to the database
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll(); // Retrieves all books
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException("Book not found")); // Finds book by ID
    }
}
