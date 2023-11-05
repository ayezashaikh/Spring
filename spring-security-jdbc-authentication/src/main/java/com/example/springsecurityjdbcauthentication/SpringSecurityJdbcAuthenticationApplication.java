package com.example.springsecurityjdbcauthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpringSecurityJdbcAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJdbcAuthenticationApplication.class, args);
	}

}
