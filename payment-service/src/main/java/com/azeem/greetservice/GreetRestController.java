package com.azeem.greetservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {


    @GetMapping("/payment")
    String getGreet() {
        return "Payment is Done! Thank You !";
    }


}
