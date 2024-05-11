package com.example.cashmanagementspring.controller;

import com.example.cashmanagementspring.dto.UserDto;
import com.example.cashmanagementspring.model.UserEntity;
import com.example.cashmanagementspring.service.abstraction.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserEntity>> listUsers() {
        List<UserEntity> users = userService.findAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserDto> addUser(@RequestBody UserEntity user) {
        UserDto userDto = userService.addUser(user);
        return new ResponseEntity<>(userDto, HttpStatus.CREATED);
    }


}
