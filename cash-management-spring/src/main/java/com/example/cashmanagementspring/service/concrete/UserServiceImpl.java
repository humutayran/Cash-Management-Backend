package com.example.cashmanagementspring.service.concrete;

import com.example.cashmanagementspring.dto.request.UserRequestDto;
import com.example.cashmanagementspring.dto.response.UserResponseDto;
import com.example.cashmanagementspring.mapper.UserMapper;
import com.example.cashmanagementspring.model.UserEntity;
import com.example.cashmanagementspring.repository.UserRepository;
import com.example.cashmanagementspring.service.abstraction.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<UserResponseDto> findAllUsers() {
        List<UserEntity> users = userRepository.findAll();
        return users.stream().map(UserMapper.INSTANCE::entityToResponseDto).collect(Collectors.toList());
    }


    @Override
    public UserResponseDto addUser(UserRequestDto user) {
        UserEntity userEntity = UserMapper.INSTANCE.requestDtoToEntity(user);
        UserEntity saved = userRepository.save(userEntity);
        return UserMapper.INSTANCE.entityToResponseDto(saved);
    }

    @Override
    public UserResponseDto getUser(Long id) {
        return UserMapper.INSTANCE.entityToResponseDto(getUserById(id));
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    protected UserEntity getUserById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow();
    }
}
