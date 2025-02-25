package com.employee;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Eight", 8);
        map.put("Four",4);
        map.put("Teen",10);
        map.put("Two",2);

        //Display
       /* for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+ entry.getValue());

        }*/
        //sorted new approach

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        //sorted old approach
        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list,(o1,o2)->o1.getValue().compareTo(o2.getValue()));


    }
}
