package com.java8;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class FindTheAgeOfAPerson {
    public static void main(String[] args) {
        LocalDate bithdate=LocalDate.of(1996, 06, 25);
        LocalDate now=LocalDate.now();
        System.out.println(ChronoUnit.YEARS.between(bithdate,now));

    }
}
