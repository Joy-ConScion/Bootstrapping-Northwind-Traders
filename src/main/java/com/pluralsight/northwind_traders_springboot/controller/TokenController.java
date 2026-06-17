package com.pluralsight.northwind_traders_springboot.controller;

import com.yearup.northwindapi.security.JwtUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/token")
public class TokenController {

    private final JwtUtil jwtUtil;

    public TokenController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @GetMapping("/user")
    public String getUserToken() {
        return jwtUtil.generateToken("testuser", List.of("ROLE_USER"));
    }

    @GetMapping("/admin")
    public String getAdminToken() {
        return jwtUtil.generateToken("adminuser", List.of("ROLE_ADMIN"));
    }
}
