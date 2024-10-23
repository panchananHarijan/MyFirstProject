package com.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigits {
    public static void main(String[] args) {
        int num=15623;
        Integer collect = Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(collect);
        int sum=0;
         while(num>0) {
             int rem = num % 10;
             sum = sum + rem;
             num = num / 10;
         }


        System.out.println(sum);
    }
}
