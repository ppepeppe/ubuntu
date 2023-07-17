package com.example.back2.service;

import com.example.back2.data.entity.UserEntity;
import com.example.back2.data.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public String getName(Long userId) {
        System.out.println(userId);
        UserEntity userEntity = userRepository.findByUserId(userId);
        System.out.println(userEntity);

        return userEntity.getUserNm();
    }
}
