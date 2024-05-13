package com.example.cashmanagementspring.service.abstraction;

import com.example.cashmanagementspring.dto.request.UserRequestDto;
import com.example.cashmanagementspring.dto.response.UserResponseDto;
import com.example.cashmanagementspring.model.UserEntity;

import java.util.List;

public interface UserService {
    List<UserResponseDto> findAllUsers();
    UserResponseDto addUser(UserRequestDto user);
    UserResponseDto getUser(Long id);
    void deleteUser(Long id);
}
