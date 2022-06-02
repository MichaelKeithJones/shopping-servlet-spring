package com.shopping.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
class AdminController {

    @GetMapping
    public String welcome() {
        return "admin";
    }

}
