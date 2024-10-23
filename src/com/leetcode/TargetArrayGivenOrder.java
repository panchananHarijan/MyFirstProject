package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArrayGivenOrder {
     public static int[] createtargetArray(int[] numbers,int[] index){
         List<Integer> list=new ArrayList<>();
        for(int i=0;i<index.length;i++)
            list.add(index[i],numbers[i]);
         int[] result=new int[numbers.length];
         for(int i=0;i<list.size();i++)
             result[i]=list.get(i);

         return result;
     }

    public static void main(String[] args) {
        int[] numbers={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        System.out.println(Arrays.toString(createtargetArray(numbers,index)));
    }
}
