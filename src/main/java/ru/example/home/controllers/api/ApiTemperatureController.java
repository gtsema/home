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

        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, Calendar.DECEMBER, 21, 12, 0, 0);
        Date date1 = calendar.getTime();
        calendar.set(2020, Calendar.DECEMBER, 21, 12, 1, 0);
        Date date2 = calendar.getTime();
        calendar.set(2020, Calendar.DECEMBER, 21, 12, 2, 0);
        Date date3 = calendar.getTime();
        calendar.set(2020, Calendar.DECEMBER, 21, 12, 3, 0);
        Date date4 = calendar.getTime();
        calendar.set(2020, Calendar.DECEMBER, 21, 12, 4, 0);
        Date date5 = calendar.getTime();

        return new LinkedList<Map<String, Object>>() {{
            add(new HashMap<String, Object>() {{ put("date", date1); put("measure", 10.0); }});
            add(new HashMap<String, Object>() {{ put("date", date2); put("measure", 10.1); }});
            add(new HashMap<String, Object>() {{ put("date", date3); put("measure", 10.2); }});
            add(new HashMap<String, Object>() {{ put("date", date4); put("measure", 10.3); }});
            add(new HashMap<String, Object>() {{ put("date", date5); put("measure", 10.4); }});
        }};
    }


//    @GetMapping
    public Map<Date, Double> getMeasure() {
        Map<Date, Double>  measure = new LinkedHashMap<>();
        Calendar calendar = Calendar.getInstance();

        calendar.set(2020, Calendar.DECEMBER, 21, 12, 0, 0);
        measure.put(calendar.getTime(), 10.2);

        calendar.set(2020, Calendar.DECEMBER, 21, 12, 1, 0);
        measure.put(calendar.getTime(), 10.4);

        calendar.set(2020, Calendar.DECEMBER, 21, 12, 2, 0);
        measure.put(calendar.getTime(), 10.7);

        calendar.set(2020, Calendar.DECEMBER, 21, 12, 3, 0);
        measure.put(calendar.getTime(), 11.2);

        calendar.set(2020, Calendar.DECEMBER, 21, 12, 4, 0);
        measure.put(calendar.getTime(), 11.5);

        calendar.set(2020, Calendar.DECEMBER, 21, 12, 5, 0);
        measure.put(calendar.getTime(), 11.9);

        calendar.set(2020, Calendar.DECEMBER, 21, 12, 6, 0);
        measure.put(calendar.getTime(), 12.4);

        calendar.set(2020, Calendar.DECEMBER, 21, 12, 7, 0);
        measure.put(calendar.getTime(), 12.8);

        calendar.set(2020, Calendar.DECEMBER, 21, 12, 8, 0);
        measure.put(calendar.getTime(), 13.3);

        calendar.set(2020, Calendar.DECEMBER, 21, 12, 9, 0);
        measure.put(calendar.getTime(), 14.0);

        return measure;
    }
}
