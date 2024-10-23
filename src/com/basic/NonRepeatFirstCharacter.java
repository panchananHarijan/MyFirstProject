package com.basic;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatFirstCharacter {
    public static void main(String[] args) {
        String str="leetCode";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(Character cl:str.toCharArray()){
            map.put(cl,map.getOrDefault(cl,0)+1);
        }

        for(Map.Entry<Character, Integer> mn: map.entrySet()){
            if(mn.getValue()>1){
                System.out.println(mn.getValue()+" "+mn.getKey());
                break;
            }
        }

    }
}
