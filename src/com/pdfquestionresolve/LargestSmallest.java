package com.pdfquestionresolve;
//Find largest and smallest number in an array in java
public class LargestSmallest {
    public static void main(String[] args) {
        int arr[] = new int[] { 23, 34, 13, 64, 72, 90, 10, 15, 9, 27 };
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){

           if(arr[i]>max){
               max=arr[i];
           }
           if(arr[i]<min){
               min=arr[i];
           }

        }
        System.out.println("Max number:"+max);
        System.out.println("Min number:"+min);

    }
}
