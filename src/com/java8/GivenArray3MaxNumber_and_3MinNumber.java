package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GivenArray3MaxNumber_and_3MinNumber {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Object[] array = listOfIntegers.stream().sorted().limit(3).toArray();
        System.out.println("min number:"+Arrays.toString(array));

        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}
