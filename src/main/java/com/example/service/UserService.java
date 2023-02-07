package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepo;

    public User save(User user) {
     userRepo.save(user);
     return user;
    }

    public List<User> getAllUser() {
        List<User> user=new ArrayList<User>();
        userRepo.findAll().forEach(user0->user.add(user0));
        return user;
    }


    public User getUserById(int id) {
        return userRepo.findByid(id);
    }

    public User deleteById(int id) {
       return userRepo.deleteByid(id);
    }

    public User update(User user) {
        userRepo.save(user);
        return user;
    }
}
