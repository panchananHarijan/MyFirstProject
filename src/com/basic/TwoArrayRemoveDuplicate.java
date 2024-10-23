package com.basic;

import java.util.HashSet;
import java.util.Set;

public class TwoArrayRemoveDuplicate {
    public static void main(String[] args) {
        int[] arr1={3,8,9,4,6,8,2};
        int[] arr2={8,6,3,1,4};
        removeDuplicateVale(arr1,arr2);
    }

    public static void removeDuplicateVale(int[] arr1,int[] arr2){

        Set<Integer> set=new HashSet<>();
        for(Integer a:arr1){
            set.add(a);
        }
        for(Integer b:arr2){
            if(!set.contains(b)){
                System.out.println(b);
            }
        }
    }

}
