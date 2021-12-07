package com.jyoti.lombok.lombok.controller;

import com.jyoti.lombok.lombok.entities.UserEntity;
import com.jyoti.lombok.lombok.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public UserEntity addUser(@RequestBody UserEntity userEntity) {
       return userService.addUser(userEntity);
    }

    @GetMapping("/get/{id}")
    public UserEntity getUser(@PathVariable (value = "id")Long id){
       return userService.getUser(id);
    }
}
