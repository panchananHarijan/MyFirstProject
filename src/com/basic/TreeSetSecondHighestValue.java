package com.basic;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSecondHighestValue {
    public static void main(String[] args) {
        int[] arr={13,34,2,34,33,1,34,34};
        int target=arr.length;
        findSecondHighest(arr,target);
    }

    public static void findSecondHighest(int[] arr,int target){
        TreeSet<Integer> tre=new TreeSet<>(Comparator.reverseOrder());
        for(Integer a:arr){
            tre.add(a);
        }
        System.out.println(tre);
        tre.pollFirst();
        System.out.println(tre.pollFirst());

    }
}
