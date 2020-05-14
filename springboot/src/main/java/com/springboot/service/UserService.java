package com.springboot.service;

import com.springboot.domain.User;
import com.springboot.mapper.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserDao userDao;
    public List<User> findAllUser(){
        return userDao.findAllUser();
    }

}
