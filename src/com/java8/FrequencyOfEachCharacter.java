package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
        /*Map<Character, Integer> hashmap = new HashMap<>();
        char[] arr = inputString.toCharArray();
        for (char ch : arr) {
            if (hashmap.containsKey(ch)) {
                hashmap.put(ch, hashmap.get(ch) + 1);
            } else {
                hashmap.put(ch, 1);
            }
        }

       for (Map.Entry<Character,Integer> map: hashmap.entrySet()){
           System.out.println(map.getKey()+":"+map.getValue());
       }*/


        Map<Character, Long> collect = inputString.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);
    }
}
