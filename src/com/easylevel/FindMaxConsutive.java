package com.easylevel;

import com.designpattern.factory.Main;

public class FindMaxConsutive {
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1};
        findMaxConsutive(arr);
    }

    public static int findMaxConsutive(int[] arr){
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                max=Math.max(max,count);
            }
            else {
                count=0;

            }
        }
        return max;

    }
}
