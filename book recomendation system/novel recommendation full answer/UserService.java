package com.bookrecommendation.service;

import com.bookrecommendation.model.User;
import com.bookrecommendation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void register(User user) {
        userRepository.save(user); // Saves the user to the database
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username); // Finds a user by username
    }
}
