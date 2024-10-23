package com.pdfquestionresolve;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        int arr[] = { 5, 34, 78, 2, 45, 1, 99, 23 };
        int firstMax=arr[0];
        int secondmax=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstMax){
                secondmax=firstMax;
                firstMax=arr[i];

            } else if (arr[i]>secondmax) {
                secondmax=arr[i];
                
            }
        }
        System.out.println("First max number:"+firstMax);
        System.out.println("second max number::"+secondmax);
    }
}
