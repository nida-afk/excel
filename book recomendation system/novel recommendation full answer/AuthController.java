package com.bookrecommendation.controller;

import com.bookrecommendation.model.User;
import com.bookrecommendation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {
    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register"; // Returns the registration view
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user) {
        userService.register(user); // Calls service to register the user
        return "redirect:/login"; // Redirects to login page after registration
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Returns the login view
    }
}
