package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindOccerenceInArray {
    public static boolean  findOccerence(int[] arr){
        Map<Integer,Integer> hashMap=new HashMap<>();
        for(int i:arr)
            hashMap.put(i,hashMap.getOrDefault(i,0)+1);
        Set<Integer> hashSet=new HashSet<>();
        for(int i:hashMap.values()){
           if(!hashSet.contains(i)){
               hashSet.add(i);
           }else{
               return false;
           }
        }
        return true;

    }

    public static void main(String[] args) {
        int[] arr={1,2,2,1,1,3};
        System.out.println( findOccerence(arr));
    }
}
