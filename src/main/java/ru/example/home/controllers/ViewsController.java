package ru.example.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class ViewsController {

    @GetMapping("")
    public String main(@RequestParam(name="name", required=false, defaultValue="World") String name, Map<String, Object> model) {
        model.put("name", name);
        return "main";
    }

    @GetMapping("temperature")
    public String temperature() {
        return "temperature";
    }
}
