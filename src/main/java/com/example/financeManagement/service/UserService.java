package com.example.financeManagement.service;

import com.example.financeManagement.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public boolean isUserExists(String email) {
        return userRepository.findByEmail(email).isPresent();
    }
}
