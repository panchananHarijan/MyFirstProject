package com.easylevel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumAndFindIndex {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString( findIndex(arr,target)));
    }

    public static int[] findIndex(int[] arr,int target){
        Map<Integer,Integer> hashmap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complect=target-arr[i];
            if(hashmap.containsKey(complect)){
                return new int[]{hashmap.get(complect),i};
            }else{
                hashmap.put(arr[i],i);
            }
        }
        throw new IllegalArgumentException("no math value");

    }

    public static int[] findSumIndex(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;i<arr.length;j++){
                if(arr[i]+arr[j]==target){
                  return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }


}
