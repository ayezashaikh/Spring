package com.azeem.welcomeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class WelcomeRestController {


    @Value("${user}")
    String user;

    @GetMapping("/welcome")
    String getWelcomeMsg() {
        return "Welcome " + user;
    }

}
