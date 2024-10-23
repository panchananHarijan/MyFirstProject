package com.pdfquestionresolve;

import java.util.HashMap;
import java.util.Map;

public class CountWord {
    public static void main(String[] args) {
        String str = "apple banna apple fruit fruit apple hello hi hi hello hi";
        totalCount(str);
    }

    public static void totalCount(String str){
        String [] st=str.split(" ");
        Map<String,Integer> map=new HashMap<>();
        int wordCount=0;
        for(String word:st){
           wordCount++;
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }
            else{
                map.put(word,1);
            }
        }
        System.out.println("Total number of words: " + wordCount);

        System.out.println("Word counts:");
        for(Map.Entry<String,Integer> entry:map.entrySet()){
                System.out.println(entry.getKey()+":"+entry.getValue());


        }
    }
}
