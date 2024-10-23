package com.techblocks;

import java.util.HashMap;
import java.util.Map;

public class targetSumindices {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int targetSum = 22;
        int[] result=findSumTwoIndex(numbers,targetSum);
        if(result.length==2){
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        }
        else {
            System.out.println("not fund ");
        }


    }

    public static int[] findSumTwoIndex(int[] numbers,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int cal=target-numbers[i];
            if(map.containsKey(cal)){
                return new int[]{map.get(cal),i};
            }
            map.put(numbers[i],i);
        }
        return new int[0];


    }
}
