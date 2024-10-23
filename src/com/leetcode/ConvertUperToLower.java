package com.leetcode;

public class ConvertUperToLower {

    public static void main(String[] args) {
        String str="HelLMo";
       convertUpper(str);
    }


    public static void convertUpper(String str){
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=65 && arr[i]<=90 ){
                arr[i]=(char)(arr[i]+32);

            }
        }
        System.out.println(String.valueOf(arr));

    }
}
