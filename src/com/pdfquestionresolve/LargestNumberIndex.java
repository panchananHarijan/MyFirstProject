package com.pdfquestionresolve;
//Find the index of the largest number in an array
public class LargestNumberIndex {
    public static void main(String[] args) {
        int arr[] = new int[] { 12, 44, 23, 56, 23, 78, 13 };
        int max=arr[0];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        System.out.println("Max Number:"+max);
        System.out.println("Index number:"+index);
    }
}
