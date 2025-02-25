package com.functionalInterface;

import java.util.Arrays;

public class CalculativeSum {

    public static int[] findCalculate(int[] arr){
        int length=arr.length;
        int[] result=new int[length];
        int sum=0;
        for(int i=length-1;i>=0;i--){
            sum+=arr[i];
            result[i]=sum;
        }
        return result;

    }
    public static void main(String[] args) {
        int[] arr={10,3,2,1};
        int[] reslt=findCalculate(arr) ;

        System.out.println("output::"+ Arrays.toString(reslt));



    }
}
