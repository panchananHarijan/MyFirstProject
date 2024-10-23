package com.basic;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedWord {
    public static void main(String[] args) {
        String str="I am a java developer and I am proud of it";
        findRepeatWord(str);

    }

    public static void findRepeatWord(String str){
        String[] arr=str.split(" ");
        Map<String,Integer> map=new HashMap<>();
        for(String st:arr){
            map.put(st,map.getOrDefault(st,0)+1);

        }

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getValue()+"-"+entry.getKey());
            }
        }


    }
}
