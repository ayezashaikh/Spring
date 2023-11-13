package com.example.RedisExample;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfig {


    @Bean
    JedisConnectionFactory getJedisConnectionFactory() {
        JedisConnectionFactory jcf = new JedisConnectionFactory();
        // since redis server and
        /*jcf.setPort(1);
        jcf.setPassword("");
        jcf.setHostName("");*/
        return jcf;
    }

    @Bean
    RedisTemplate<String, User> redistemplate() {
        RedisTemplate<String, User> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(getJedisConnectionFactory());
        return redisTemplate;
    }


}
