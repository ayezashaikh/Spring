package com.example.RedisExample;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class UserService {

    HashOperations<String, Integer, User> opsForHash = null;

    public UserService(RedisTemplate<String, User> redisTemplate) {
        this.opsForHash = redisTemplate.opsForHash();
    }

    public String addUser(User user) {
        opsForHash.put("User", user.getId(), user);
        return "User added ";
    }

    public User getUser(Integer id) {
        return opsForHash.get("User", id);
    }

    public List<User> getAllUser() {
        Collection<User> user = opsForHash.entries("User").values();
        return user.stream().toList();
    }


}
