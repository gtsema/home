package ru.example.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewsController {

    @GetMapping("")
    public String main() {
            return "index";
        }

    @GetMapping("temperature")
    public String temperature() {
        return "temperature";
    }
}
