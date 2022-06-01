package com.shopping.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
class HomeController {

    @GetMapping("/home")
    public String welcome() {
        return "home";
    }

}
