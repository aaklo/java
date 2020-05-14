package com.springboot.controller;

import com.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;
    @GetMapping("/get/{key}")
    public String getKey(@PathVariable(name="key") String key){
        return stringRedisTemplate.opsForValue().get(key);
    }
    @PostMapping("/set/{key}/{value}")
    public String getRedis(@PathVariable(name="key")String key,@PathVariable(name="value")String value){
        stringRedisTemplate.opsForValue().set(key,value);
        return "SUCCESS";
    }
    @GetMapping("/postEntity")
    public String postEntity(){
        User user=new User();
        user.setId(1);
        user.setName("pwl");
        redisTemplate.opsForValue().set(user.getId(),user);
        return "SUCCESS";
    }
    @GetMapping("/getEntity/{key}")
    public Object getEntity(@PathVariable(name="key")String key){
        return redisTemplate.opsForValue().get(key);
    }

}
