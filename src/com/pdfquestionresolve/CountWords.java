package com.pdfquestionresolve;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

//Program to count number of duplicate words in given string
public class CountWords {
    public static void main(String[] args) {
        String input="Welcome to Java Session Session Session java";
        String[] s = input.split(" ");
        Map<String,Integer> map=new HashMap<>();
        for(String word:s){
            word=word.toLowerCase();
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }
            else{
                map.put(word,1);
            }
        }
        System.out.println("Duplicate found :");
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+"= "+entry.getValue());
            }
        }
    }
}
