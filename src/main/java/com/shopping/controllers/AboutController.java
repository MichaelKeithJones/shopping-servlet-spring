package com.shopping.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/about")
class AboutController {

    @GetMapping
    public String welcome() {
        return "about";
    }

}