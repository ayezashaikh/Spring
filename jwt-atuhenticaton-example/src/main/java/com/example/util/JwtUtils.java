package com.example.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;


@Component
public class JwtUtils {
    private String SECRET_KEY = "secret";

    public String extractUserName(String token) {
        return extratClaims(token, Claims::getSubject);
    }

    public <T> T extratClaims(String token, Function<Claims, T> claimResolver) {
        final Claims claims = extractAllClaims(token);
        return claimResolver.apply(claims);
    }

    private Claims extractAllClaims(String token) {
        return Jwts.parser().setSigningKey(SECRET_KEY).build().parseClaimsJws(token).getBody();
    }

    public Date extractExpiration(String token) {
        return extratClaims(token, Claims::getExpiration);
    }

    private Boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    public String generateToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>();
        return createToken(claims, userDetails.getUsername());
    }

    public String createToken(Map claims, String subject) {
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(subject)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 1060 * 10))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY).compact();
    }


    public Boolean validateToken(String token, UserDetails userDetails) {

        final String username = extractUserName(token);
        return username.equals(userDetails.getUsername()) && !isTokenExpired(token);
    }

}
