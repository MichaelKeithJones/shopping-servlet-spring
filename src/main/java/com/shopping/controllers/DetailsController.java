package com.shopping.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/details")
class DetailsController {

    @GetMapping
    public String welcome() {
        return "details";
    }

}
