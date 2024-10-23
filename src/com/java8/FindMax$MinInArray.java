package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMax$MinInArray {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        Integer i = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        System.out.println(i);
        Integer i1 = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.out.println(i1);

    }
}
