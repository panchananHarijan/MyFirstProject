package com.easylevel;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
       moveZero(arr);

    }
    public static void moveZero(int [] arr){
     int nonZeroIndex=0;
     for(int i=0;i<arr.length;i++){
         if(arr[i]!=0){
            int temp=arr[nonZeroIndex];
            arr[nonZeroIndex]=arr[i];
            arr[i]=temp;
            nonZeroIndex++;
         }
     }
     for (int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
     }

    }

    public static void moveZeros(int [] arr){
        int nonZeroIndex=0;
        for(int ar:arr){
            if(ar!=0){
                int temp=arr[nonZeroIndex];
                arr[nonZeroIndex]=arr[ar];
                arr[ar]=temp;
                nonZeroIndex++;
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
