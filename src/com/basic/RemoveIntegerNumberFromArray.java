package com.basic;

import java.util.Arrays;

public class RemoveIntegerNumberFromArray {


    public static void main(String[] args) {
      int arr[]={3,2,4,7,10,6,5};
        System.out.println(Arrays.toString(removeIntegervalue(arr)));
    }

    public static int[] removeIntegervalue(int[] arr){
        int oddCount=0;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddCount++;
            }
        }
        int[] result=new int[oddCount];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                result[index]=arr[i];
                index++;
            }
        }
      return result;
    }
}
