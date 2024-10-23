package com.pdfquestionresolve;
//Program to remove duplicate element in an array
public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 6, 8, 9, 10, 10, 10, 12, 12 };
        int[] result=removeDuplicateElement(arr);
        for(int n:arr){
            System.out.print(n+",");
        }
        System.out.println();
        for(int m:result){
            System.out.print(m+",");
        }

    }
    public static int[] removeDuplicateElement(int[] arr){
        int i=1;
        int j=0;
        if(arr.length<2){
          return arr;
        }
        while(i<arr.length){
            if(arr[i]==arr[j]){
                i++;
            }
            else{
                arr[++j]=arr[i++];
            }
        }
        int[] output=new int[j+1];
        for(int k=0;k<output.length;k++){
            output[k]=arr[k];
        }
        return output;
    }
}
