package com.java8;

import java.util.Arrays;
import java.util.List;

public class GotLastElementOfAnArray {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
        System.out.println(listOfStrings.size());
        String s = listOfStrings.stream().skip(listOfStrings.size() - 1).findFirst().get();


    }
}
