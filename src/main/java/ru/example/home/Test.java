package ru.example.home;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, Calendar.DECEMBER, 21, 12, 0, 0);
        Date data = calendar.getTime();

        System.out.println(data.getTime());

        ArrayList<String> test = new ArrayList<String>();
    }
}
