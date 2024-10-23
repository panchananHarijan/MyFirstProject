package com.techblocks;


import java.util.HashMap;
import java.util.Map;

public class CharcterCount {

    public static void main(String[] args) {
        String str="MADAM";
        char[] array = str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(Character value:array){
            if(map.containsKey(value)){
                map.put(value,map.get(value)+1);
            }
            else {
                map.put(value,1);
            }
        }
        System.out.println(map);
    }
}
