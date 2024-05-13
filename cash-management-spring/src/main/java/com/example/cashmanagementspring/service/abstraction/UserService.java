package com.example.cashmanagementspring.service.abstraction;

import com.example.cashmanagementspring.dto.UserDto;
import com.example.cashmanagementspring.model.UserEntity;

import java.util.List;

public interface UserService {
    List<UserDto> findAllUsers();
    UserDto addUser(UserEntity user);

    UserDto getUser(Long id);
}
