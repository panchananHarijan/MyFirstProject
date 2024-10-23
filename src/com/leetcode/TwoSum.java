package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] num={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(num,target)));
        test(num,target);

    }

    public static int[] twoSum(int[] num,int target){
        Map<Integer, Integer> map = new HashMap<>();

          for(int i=0;i<num.length;i++){
              int result=target-num[i];
              if(map.containsKey(result)){
                  return new int[]{i,map.get(result)};
              }
              map.put(num[i], i);
          }
        System.out.println(map);
        return new int[0];
    }

    static void test(int [] arr,int target){

        for (int i=0;i<arr.length;i++){

            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==target)
                    System.out.print(i+" "+ j);
            }
        }

    }
}
