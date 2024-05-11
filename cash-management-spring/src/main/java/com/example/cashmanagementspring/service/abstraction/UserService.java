package com.example.cashmanagementspring.service.abstraction;

import com.example.cashmanagementspring.dto.UserDto;
import com.example.cashmanagementspring.model.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> findAllUsers();
    UserDto getUser();
    UserDto addUser(UserEntity user);
}
