package com.leetcode;

import java.util.HashSet;

public class TripleetSum {
       public static  void findTriple(int[] arr,int target){
           boolean found=false;
           for(int i=0;i<arr.length-2;i++){
               HashSet<Integer> set=new HashSet<>();
               int currentSum=target-arr[i];
               for(int j=i+1;j<arr.length;j++){
                   if(set.contains(currentSum-arr[j])){
                       System.out.println("Triplet: {" + arr[i] + ", " + arr[j] + ", " + (currentSum - arr[j]) + "}");
                       found = true;
                   }
                   set.add(arr[j]);
               }

           }

       }

    public static void main(String[] args) {
        int[] nums = {2, 7, 4, 0, 9, 5, 1, 3};
        int target = 6;

        findTriple(nums, target);

    }
}
