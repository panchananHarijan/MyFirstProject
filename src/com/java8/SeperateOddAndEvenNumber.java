package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SeperateOddAndEvenNumber {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        Map<Boolean, List<Integer>> oddEvenNumberMap = listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        Set<Map.Entry<Boolean, List<Integer>>> entrySet = oddEvenNumberMap.entrySet();

        for(Map.Entry<Boolean,List<Integer>> mp:entrySet){
            if(mp.getKey()){
                System.out.println("even number");
            }
            else{
                System.out.println("odd number");
            }
            List<Integer> ls=mp.getValue();
            for (Integer i:ls){
                System.out.println(i);
            }
        }



    }
}
