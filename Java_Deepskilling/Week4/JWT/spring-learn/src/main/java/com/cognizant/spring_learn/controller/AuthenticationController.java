package com.cognizant.spring_learn.controller;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        LOGGER.info("Start Authentication");
        LOGGER.debug("Auth Header: {}", authHeader);

        String user = getUser(authHeader); // Decode base64 & extract username
        String token = generateJwt(user);  // Generate JWT

        Map<String, String> map = new HashMap<>();
        map.put("token", token);

        LOGGER.info("End Authentication");
        return map;
    }

    // Extract username from base64 Basic header
    private String getUser(String authHeader) {
        String encodedCredentials = authHeader.substring("Basic ".length());
        byte[] decoded = Base64.getDecoder().decode(encodedCredentials);
        String decodedString = new String(decoded);
        LOGGER.debug("Decoded String: {}", decodedString); // Example: "user:pwd"

        return decodedString.split(":")[0]; // Return only username
    }

    // Generate JWT token
    private String generateJwt(String user) {
        JwtBuilder builder = Jwts.builder();
        builder.setSubject(user);
        builder.setIssuedAt(new Date());
        builder.setExpiration(new Date(System.currentTimeMillis() + 1200000)); // 20 mins
        builder.signWith(SignatureAlgorithm.HS256, "secretkey");
        return builder.compact();
    }
}
