package com.pdfquestionresolve;

public class SmallestNumberIndex {
    public static void main(String[] args) {
        int arr[] = new int[]{12,44,23,56,9,23,78,13};
        int min=arr[0];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
                index=i;
            }
        }
        System.out.println("Minimum value are:"+min);
        System.out.println("Minimum value index:"+index);

    }
}
