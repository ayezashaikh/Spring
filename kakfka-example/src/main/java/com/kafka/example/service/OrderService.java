package com.kafka.example.service;

import com.kafka.example.constant.AppConstant;
import com.kafka.example.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    KafkaTemplate<String, Order> kafkaTemplate;

    public String addMsg(Order order) {
        kafkaTemplate.send(AppConstant.TOPIC, order);
        return "msg added";
    }



}
