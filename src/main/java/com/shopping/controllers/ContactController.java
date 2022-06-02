package com.shopping.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/contact")
class ContactController {

    @GetMapping
    public String welcome() {
        return "contact";
    }

}
