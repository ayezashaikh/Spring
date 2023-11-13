package com.example.jwt;


import com.example.jwt.model.AuthenticationRequest;
import com.example.jwt.model.AuthenticationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    MyUserDetailService myUserDetailService;


    @Autowired
    private JwtUtils jwtUtils;


    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }


    @PostMapping("/authenticate")
    public ResponseEntity<?> authenticate(@RequestBody AuthenticationRequest authenticationRequest) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),
                authenticationRequest.getPassword()));
        UserDetails userDetails = myUserDetailService.loadUserByUsername(authenticationRequest.getUsername());
        String authToken = jwtUtils.generateToken(userDetails);
        AuthenticationResponse authenticationResponse = new AuthenticationResponse(authToken);
        return new ResponseEntity<>(authenticationResponse, HttpStatus.OK);
    }



}
