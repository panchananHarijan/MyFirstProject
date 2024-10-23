package com.pdfquestionresolve;
//Program to find largest number in an array
public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = new int[] { 20, 30, 50, 4, 71, 100};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
        System.out.println(max);

    }
}
