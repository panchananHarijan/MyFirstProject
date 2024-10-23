package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExtractDuplicateElementOfArray {
    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> hshset=new HashSet<>();
        Set<Integer> mon=listOfIntegers.stream().filter(i->!hshset.add(i)).collect(Collectors.toSet());

        System.out.println(mon);

    }
}
