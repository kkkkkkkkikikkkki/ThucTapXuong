package com.phong.thuctapxuong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class connectController {
    @GetMapping("/")
    public String Connect() {
        return "Connect";
    }
}
