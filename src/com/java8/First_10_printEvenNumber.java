package com.java8;

import java.util.stream.IntStream;

public class First_10_printEvenNumber {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,10).map(i->i*2).forEach(System.out::println);
    }
}
