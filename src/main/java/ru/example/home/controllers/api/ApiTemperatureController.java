package ru.example.home.controllers.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("api/temperature")
public class ApiTemperatureController {

    @GetMapping
    public List<Map<String, Object>> getData() {
        return getTestData(0, 50, 50);
    }

    private List<Map<String, Object>> getTestData(int start, int stop, int num) {
        List<Map<String, Object>> result = new LinkedList<>();
        Calendar cal = Calendar.getInstance();
        for(int i = 0; i < num; i++) {
            cal.set(2020, Calendar.DECEMBER, 22, 12, i, 0);
            double value = (stop - start) * Math.random() + start;
            result.add(new HashMap<String, Object>() {{ put("date", cal.getTime()); put("value", value); }});
        }
        return result;
    }
}
