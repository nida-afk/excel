package com.bookrecommendation.controller;

import com.bookrecommendation.model.Rating;
import com.bookrecommendation.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @PostMapping("/rate")
    public String submitRating(@ModelAttribute Rating rating) {
        ratingService.save(rating); // Calls service to save the rating
        return "redirect:/books"; // Redirects back to books page
    }
}
