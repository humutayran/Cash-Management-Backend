package com.example.cashmanagementspring.controller;

import com.example.cashmanagementspring.dto.UserDto;
import com.example.cashmanagementspring.model.UserEntity;
import com.example.cashmanagementspring.service.abstraction.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

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
    public ResponseEntity<List<UserDto>> listUsers() {
        List<UserDto> users = userService.findAllUsers();
        return new ResponseEntity<>(users, OK);
    }

    @PostMapping
    public ResponseEntity<UserDto> addUser(@RequestBody UserEntity user) {
        UserDto userDto = userService.addUser(user);
        return new ResponseEntity<>(userDto, CREATED);
    }


}
