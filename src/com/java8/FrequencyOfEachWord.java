package com.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachWord {
    public static void main(String[] args) {
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        /*Map<String,Integer> hashmap=new HashMap<>();
        for(String word:stationeryList){
            if(hashmap.containsKey(word)){
                hashmap.put(word,hashmap.get(word)+1);

            }
            else{
                hashmap.put(word,1);
            }
        }
        System.out.println(hashmap);*/

        Map<String,Long> ml=stationeryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(ml);

        for(Map.Entry<String,Long> rs:ml.entrySet()){
            System.out.println(rs.getKey()+" :"+ rs.getValue());
        }

    }
}
