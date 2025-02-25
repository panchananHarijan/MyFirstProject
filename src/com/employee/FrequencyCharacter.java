package com.employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCharacter {
    public static void main(String[] args) {
        String str="Hyderabadyd";
        char[] arr=str.toCharArray();
        Map<Character,Integer> hashmap=new HashMap<>();
        for(char ch:arr){
            if(hashmap.containsKey(ch)){
                hashmap.put(ch, hashmap.get(ch)+1);

            }
            else{
                hashmap.put(ch,1);
            }
        }//end th

        //System.out.println(hashmap);

       /* for(Map.Entry<Character,Integer> entry:hashmap.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }*/

       /* hashmap.forEach((key,value)->{
            System.out.println(key+":"+value);
        });*/

        List<Map.Entry<Character,Integer>> list=new ArrayList<>(hashmap.entrySet());

       System.out.println(list);

        Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors
                .groupingBy(Function.identity(), Collectors.counting()));


        Map<Character, Long> collect1 = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


    }
}
