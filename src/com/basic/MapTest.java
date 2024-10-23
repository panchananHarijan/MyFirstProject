package com.basic;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("person",20);
        map.put("person1",20);
        //System.out.println(map);

        for(Map.Entry<String,Integer> mp:map.entrySet()){
            System.out.println(mp.getKey()+"-"+mp.getValue());
        }

    }
}
