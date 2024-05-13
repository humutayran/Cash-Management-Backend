package com.example.cashmanagementspring.controller;

import com.example.cashmanagementspring.dto.request.UserRequestDto;
import com.example.cashmanagementspring.dto.response.UserResponseDto;
import com.example.cashmanagementspring.service.abstraction.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ResponseEntity<List<UserResponseDto>> listUsers() {
        List<UserResponseDto> users = userService.findAllUsers();
        return new ResponseEntity<>(users, OK);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserResponseDto> getUser(@PathVariable Long userId) {
        UserResponseDto user = userService.getUser(userId);
        return new ResponseEntity<>(user, OK);
    }
    @PostMapping
    public ResponseEntity<UserResponseDto> addUser(@RequestBody UserRequestDto user) {
        UserResponseDto userResponseDto = userService.addUser(user);
        return new ResponseEntity<>(userResponseDto, CREATED);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
        return new ResponseEntity<>(OK);
    }
}
