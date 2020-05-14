package com.springboot.controller;

import com.springboot.domain.User;
import com.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class HelloController {
    @Autowired
    UserService userService;
    @GetMapping("/hello")
    public List<User> hello(){
        List<User> list = userService.findAllUser();
        return list;
    }
}
