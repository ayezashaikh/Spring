package com.example.springsecurityjdbcauthentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfigurar {


    @Autowired
    DataSource dataSource;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource)
                .passwordEncoder(new BCryptPasswordEncoder())
                .usersByUsernameQuery("select  username,password, enabled  from users where username=?")
                .authoritiesByUsernameQuery("select username, authority from authorities where username=?");
    }

    @Bean
    public SecurityFilterChain securityConfig(HttpSecurity httpSecurity) throws Exception {
         httpSecurity.authorizeHttpRequests(httpRequest -> httpRequest.requestMatchers("/admin")
                        .hasRole("ADMIN").requestMatchers("/user")
                        .hasAnyRole("ADMIN", "USER").requestMatchers("/").permitAll().anyRequest().authenticated())
                .formLogin(Customizer.withDefaults());

         return  httpSecurity.build();
    }

}
