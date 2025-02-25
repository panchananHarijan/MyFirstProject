package com.leetcodepractic;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        String [] strings={"apple","banana","apple","orange","banana"};
        findDuplicate(strings);
        findDuplicateFrom(strings);
        usingJava8(strings);
    }
    public static void findDuplicate(String[] str){
       Set<String> set=new HashSet<>();
       for(String st:str){
           if(!set.add(st)){
               System.out.println("Duplicate String::"+st);
           }
       }

    }
    public static void findDuplicateFrom(String[] str){
        Map<String,Integer> map=new HashMap<>();
        for(String sr:str){
            if(map.containsKey(sr)){
                map.put(sr,map.get(sr)+1);
            }
            else{
                map.put(sr,1);
            }
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
           if(entry.getValue()>1){
               System.out.println("Duplicate String::"+entry.getKey());
           }
        }

    }

    public static void usingJava8(String[] arr){
        Arrays.stream(arr).collect(Collectors.groupingByConcurrent(Function.
                identity(),Collectors.counting())).entrySet().stream().filter(entry->entry.getValue()>1)

                .forEach(entry-> System.out.println("DPL String:"+entry.getKey()));
    }

    //



}
