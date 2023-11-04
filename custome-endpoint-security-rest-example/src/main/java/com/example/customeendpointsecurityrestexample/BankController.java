package com.example.customeendpointsecurityrestexample;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @GetMapping("/balance")
    String getBalance() {
        return "Your Balance is 5000.0$";
    }

    @GetMapping("/customer-login")
    String getLogin() {
        return "This is login page";
    }

    @GetMapping("/contact-us")
    String getContactUs() {
        return "This is Contact US page";
    }

}
