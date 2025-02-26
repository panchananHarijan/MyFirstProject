package com.easylevel;

public class MaxAscendingSum {
    public static void main(String[] args) {
        int[] arr={10,20,30,5,10,50};
        maxAscendingSum(arr);

    }
    public static int maxAscendingSum(int[] arr){
        int sum=arr[0];
        int maxSum=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                sum+=arr[i];
            }
            else{
                sum=arr[i];
            }
            maxSum=Math.max(maxSum,sum);
        }
        return sum;
    }
}
