package com.kafka.example;


import com.kafka.example.model.Order;
import com.kafka.example.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/order")
    public String order(@RequestBody Order order) {
        return orderService.addMsg(order);
    }




}
