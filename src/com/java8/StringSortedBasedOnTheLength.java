package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringSortedBasedOnTheLength {
    public static void main(String[] args) {
        List<String> lst= Arrays.asList("Java", "Python", "C#","Anocanda" ,"HTML", "Kotlin", "C++", "COBOL", "C");
        lst.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}
