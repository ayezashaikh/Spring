package com.example.customeendpointsecurityrestexample;

import jakarta.servlet.FilterChain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    SecurityFilterChain security(HttpSecurity httpSecurity) throws Exception {
         return  httpSecurity.authorizeHttpRequests(
                 httpRequest->httpRequest.requestMatchers("/customer-login","/contact-us")
                         .permitAll().anyRequest().authenticated()).formLogin(Customizer.withDefaults()).build();
    }
}
