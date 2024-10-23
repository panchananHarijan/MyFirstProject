package com.basic;

public class NonRepeatCharacter {
    public static void main(String[] args) {
        String str = "leetcode";
        char[] arr=str.toCharArray();
        boolean found=false;
         for(int i=0;i<arr.length; i++){
             found=false;
             for(int j=i+1;j<arr.length;j++){
                 if(i!=j && arr[i]==arr[j]){
                     found=true;
                     break;

                 }
             }
             if(!found){
                 System.out.println(arr[i]);
                 break;
             }

         }

    }
}
