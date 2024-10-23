package com.leetcode;

public class SumOfUniqueElement {
    public static int sumOfUniqueElement(int[] nums){
        int sum=0;
        for(int i:nums){
            boolean unique= uniqueCheck(i,nums);
                if(unique){
                    sum=sum+i;
                }

            }

        return sum;

    }

    public static boolean uniqueCheck(int num,int[] nums){
        int count=0;
        for(int i:nums){
            if(i==num){
                count++;
            }
            if(count>1){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println( sumOfUniqueElement(arr));

    }
}
