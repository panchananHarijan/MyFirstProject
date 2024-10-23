package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElementFromList {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        List<String> lst=listOfStrings.stream().distinct().collect(Collectors.toList());
        for (String mn:lst){
            System.out.print(mn+", ");
        }
    }
}
