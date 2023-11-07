package com.example.log4j2logging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Autowired
    LggingTest lggingTest;

    @GetMapping("/test")
    String get() {
        lggingTest.payment();
        return "Hellow";
    }
}
