package com.basic;


import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String inputStr="manojpandey";
        findDuplicate(inputStr);
    }

    public static void findDuplicate(String inputStr){
        Map<Character,Integer> map=new HashMap<>();

        for(char ch:inputStr.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getValue()+ "- "+ entry.getKey());
            }
        }



    }
}
