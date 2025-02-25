package com.employee;

import java.util.Arrays;

public class RemoveVowelAndInteger {
    public static void main(String[] args) {
        String str="harijanpanchanan9321verkito";
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(!Character.isDigit(arr[i]) && !isVowel(arr[i])){
                //System.out.print(arr[i]);
            }
        }

        int[] arr1={0,0,8,3,8,4,9,1,1,2,7,5,5,2,6};
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++){
            if(i==0|| arr1[i]!=arr1[i-1]){
                System.out.println(arr1[i]+" ,");
            }
        }




    }

    public static boolean isVowel(char c){
        char lowerCase = Character.toLowerCase(c);
        return lowerCase=='a' ||lowerCase=='e'||lowerCase=='i' || lowerCase=='o'||lowerCase=='u';
    }
}
