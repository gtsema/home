package ru.example.home.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/temperature")
public class TemperatureController {

    @GetMapping
    public Map<String, Integer> getMeasure() {
        return new HashMap<String, Integer>() {{
            put("1", 10); put("2", 20); put("3", 30);
        }};
    }
}
