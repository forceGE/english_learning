package com.example.english_learning.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
public class UserCustomer {

    @GetMapping
    public String getAllUsers() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "ResponseEntity.ok(new Object())";
    }
}
