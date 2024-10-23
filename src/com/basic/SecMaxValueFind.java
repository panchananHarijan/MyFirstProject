package com.basic;

import java.util.Arrays;

public class SecMaxValueFind {
    public static void main(String[] args) {
        int[] arr={13,34,2,34,33,1,34,34};
        int target=arr.length;
        System.out.println(( secondMaxValu(arr,target)));
    }

    public static int secondMaxValu(int[] arr,int target){
        for(int i=0;i<target;i++){
            for(int j=i+1;j<target;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        return arr [target-3];


    }
}
