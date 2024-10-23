package com.java8;

import java.util.stream.IntStream;

public class InRangeSum {
    public static void main(String[] args) {
        Integer res=IntStream.range(1,11).sum();
        System.out.println(res);
    }
}
