package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userServ;

    @PostMapping("/user")
    private User saveUser(@RequestBody User user ){
        userServ.save(user);
        return user;
    }

    @GetMapping("/user")
    private List<User> getAllUser(){
        return userServ.getAllUser();
    }

    @GetMapping("/user/{id}")
    private User getUser(@PathVariable("id") int id){
        return userServ.getUserById(id);
    }

    @DeleteMapping("/user/{id}")
    private User deleteUser(@PathVariable("id") int id){
        return userServ.deleteById(id);
    }
    @PutMapping("/user")
    private User updateUser(@RequestBody User user){
        userServ.update(user);
        return user;
    }

}
