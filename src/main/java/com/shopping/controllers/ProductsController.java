package com.shopping.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/products")
class ProductsController {

    @GetMapping
    public String welcome() {
        return "products";
    }

}