package com.bookrecommendation.controller;

import com.bookrecommendation.model.Book;
import com.bookrecommendation.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/books")
    public String addBook(@ModelAttribute Book book) {
        bookService.addBook(book); // Calls service to add a new book
        return "redirect:/books"; // Redirects to list of books
    }

    @GetMapping("/books")
    public String viewBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks()); // Adds all books to the model
        return "bookList"; // Returns the book list view
    }

    @GetMapping("/books/{id}")
    public String getBook(@PathVariable int id, Model model) {
        model.addAttribute("book", bookService.getBookById(id)); // Adds book details to the model
        return "bookDetail"; // Returns the book detail view
    }
}
