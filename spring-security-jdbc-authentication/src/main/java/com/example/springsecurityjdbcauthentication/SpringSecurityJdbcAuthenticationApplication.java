package com.example.springsecurityjdbcauthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class SpringSecurityJdbcAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJdbcAuthenticationApplication.class, args);
	}

}
