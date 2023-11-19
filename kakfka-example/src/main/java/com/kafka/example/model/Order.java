package com.kafka.example.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Order {
    private String orderId;
    private Double orderPrice;
    private String customerEmail;

}
