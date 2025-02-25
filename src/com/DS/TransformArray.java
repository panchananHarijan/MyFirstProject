package com.DS;

import java.util.Arrays;

public class TransformArray {

    public static int[] toTransFormArray(int[] input){
        int[] output=new int[input.length];

        for(int i=0;i<input.length;i++){
            output[i]=input[i]*2+1;
        }
        return output;
    }

    public static void main(String[] args) {
        int[] input = {10, 3, 2, 1};
        System.out.println(Arrays.toString( toTransFormArray(input)));
    }
}
