package com.DS;

public class FindMissingNumberFromSequenceArray {

    public static int findMissingNumber(int[] arr,int num){
        int sum=(num*(num+1))/2;
        for(int n:arr){
            sum=sum-n;
        }
        return sum;


    }
    public static void main(String[] args) {
        int [] arr={1,2,3,5,6};
        int num=6;
        findMissingNumber(arr,num);

    }
}
