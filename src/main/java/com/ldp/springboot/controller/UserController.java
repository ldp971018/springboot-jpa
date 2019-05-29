package com.ldp.springboot.controller;

import com.ldp.springboot.entity.User;
import com.ldp.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Return
 * @create 2019-05-27 16:29
 */

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        return userRepository.findOne(id);
    }

    @GetMapping("/user")
    public User insertUser(User user){
        return userRepository.save(user);
    }
}
