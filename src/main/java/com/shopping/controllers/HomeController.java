package com.shopping.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/home")
class HomeController {

    @GetMapping
    public String welcome() {
        return "home";
    }

}
