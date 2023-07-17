package com.example.back2.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    String getName(Long userId);
}
