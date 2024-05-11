package com.example.cashmanagementspring.service.concrete;

import com.example.cashmanagementspring.dto.UserDto;
import com.example.cashmanagementspring.mapper.UserMapper;
import com.example.cashmanagementspring.model.UserEntity;
import com.example.cashmanagementspring.repository.UserRepository;
import com.example.cashmanagementspring.service.abstraction.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserEntity> findAllUsers() {
        List<UserEntity> users = userRepository.findAll();
        return users.stream().collect(Collectors.toList());
    }

    @Override
    public UserDto getUser() {
        return null;
    }

    @Override
    public UserDto addUser(UserEntity user) {
        userRepository.save(user);
        UserDto userDto = UserMapper.INSTANCE.entityToDto(user);
        return userDto;
    }
}
