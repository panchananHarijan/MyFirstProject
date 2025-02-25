
package com.leetcodepractic;

import java.util.Arrays;


public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8, 9};
        int[] arr2 = {4, 7, 9, 11};
        int[] mergedArray = mergeSortedArrays(arr1, arr2);
        System.out.println("Merged Sorted Array: " + Arrays.toString(mergedArray));
    }
    public static int[] mergeSortedArrays(int[] arr1,int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int[] merge=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                merge[k++]=arr1[i++];
            }
            else{
                merge[k++]=arr2[j++];
            }
        }
        while (i<n1) {
            merge[k++]=arr1[i++];
        }
        while(j<n2){
            merge[k++]=arr1[j++];
        }
        return merge;



     }
}


