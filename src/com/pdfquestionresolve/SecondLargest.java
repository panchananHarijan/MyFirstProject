package com.pdfquestionresolve;
//Program to find second largest number in an array
public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
        int largest=arr[0];
        int secondLargest=arr[0];
        for(int i=0;i<arr.length;i++){
            System.out.println("given array::"+arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            } else if (arr[i]>secondLargest) {
                secondLargest=arr[i];
            }
        }
        System.out.println("Second largest nummber="+secondLargest);
    }
}
