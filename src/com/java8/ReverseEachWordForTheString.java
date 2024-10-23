package com.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordForTheString {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";
        String result=Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
