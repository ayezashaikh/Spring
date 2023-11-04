package com.azeem.welcomeservice;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:9092", name = "payment")
public interface PaymentFeignClient {

    @GetMapping("/payment")
    String invokePaymentService();


    @GetMapping("/detail/{id}")
    String paymentDetail(@PathVariable("id") String id);

}
