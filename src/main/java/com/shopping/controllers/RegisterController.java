package com.shopping.controllers;

import com.shopping.models.*;
import com.shopping.repositories.*;

import org.springframework.ui.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.password.*;

@Controller
public class RegisterController {

    private UserRepository userDao;
    private PasswordEncoder passwordEncoder;

    public RegisterController(UserRepository userDao, PasswordEncoder passwordEncoder) {
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/sign-up")
    public String showSignupForm(Model model){
        model.addAttribute("user", new User());
        return "sign-up";
    }

    @PostMapping("/sign-up")
    public String saveUser(@ModelAttribute User user){
        String hash = passwordEncoder.encode(user.getPassword());
        user.setPassword(hash);
        user.setProfile_image_url("None");
        userDao.save(user);
        return "redirect:/login";
    }

}
