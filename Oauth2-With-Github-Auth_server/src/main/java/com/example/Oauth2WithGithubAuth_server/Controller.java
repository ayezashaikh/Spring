package com.example.Oauth2WithGithubAuth_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    String welcome() {
        return "Welcome to Ashok IT";
    }
}
