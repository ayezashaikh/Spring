package com.azeem.greetservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {



    @Autowired
    Environment environment;



    @GetMapping("/greet")
    String getGreet() {

        return "Good evening from port " +environment.getProperty("server.port");
    }
}
