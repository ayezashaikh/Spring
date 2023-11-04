package com.example.springsecurityjdbcauthentication;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {


    @GetMapping("/user")
    public String user() {
        return "<h1> Hello user<h1>";
    }


    @GetMapping("/admin")
    public String admin() {
        return "<h1> Hello Admin<h1>";
    }

    @GetMapping("/")
    public String welcome() {
        return "<h1> Welcome Page <h1>";
    }


}
