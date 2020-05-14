package com.springboot.controller;

import com.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MongoController {
    @Autowired
    private MongoTemplate mongoTemplate;
    @GetMapping("/findAllUserFromMongo")
    public List<User> findAllUser(){
        List<User> list = mongoTemplate.findAll(User.class);
        return list;
    }
}
