package com.codemaster.academy.service;

import com.codemaster.academy.dto.RegistrationRequest;
import com.codemaster.academy.entity.User;
import com.codemaster.academy.repository.UserRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(RegistrationRequest registrationRequest){
            // Convert dto to entity for storage
            User user = new User();
            user.setUsername(registrationRequest.getUsername());
            // Perform any necessary business logic/validation
            // For example, check if the user already exists, validate input, etc.

            // Save the user to the database using the UserRepository
            return userRepository.save(user);
    }
}
