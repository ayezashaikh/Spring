package com.example.RedisExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/user/{id}")
    User getUser(@PathVariable("id") Integer id) {
        return userService.getUser(id);
    }

    @GetMapping("/allUser")
    List<User> getAllUser(){
        return  userService.getAllUser();
    }

}
