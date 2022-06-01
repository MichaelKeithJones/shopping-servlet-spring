package com.shopping.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
}