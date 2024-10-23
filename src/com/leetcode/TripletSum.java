package com.leetcode;

import java.util.Arrays;

public class TripletSum {
    public static void findTriplet(int[] nums,int target){
        Arrays.sort(nums);
        boolean found=false;
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target){
                    System.out.println("Triplet: {" + nums[i] + ", " + nums[left] + ", " + nums[right] + "}");
                    found=true;
                    left++;
                    right--;
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }


        }
        if(!found){
            System.out.println("No triplet found.");
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 4, 0, 9, 5, 1, 3};
        int target = 6;
        findTriplet(nums,target);
    }
}