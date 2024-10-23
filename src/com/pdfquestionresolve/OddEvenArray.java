package com.pdfquestionresolve;
//Program to print odd and even numbers from an array
public class OddEvenArray {
    public static void main(String[] args) {
        int[] arr = { 33, 2, 4, 71, 88, 92, 9, 1 };

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("input number are::");
        for(int i=0;i<arr.length;i++){
            System.out.print(","+arr[i]);
        }
        System.out.println();
        System.out.print("Even number:");
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]%2==0){
                System.out.print(","+arr[i]);
            }
        }
        System.out.println();
        System.out.print("Odd number are:");

        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]%2!=0){
                System.out.print(","+arr[i]);
            }
        }
    }
}
