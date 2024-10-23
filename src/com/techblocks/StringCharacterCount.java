package com.techblocks;

public class StringCharacterCount {
    public static void main(String[] args) {
        String str="welcome to hyderabad";
        String[] arr = str.split(" ");
        String rev=" ";
         for(int i=arr.length-1;i>=0;i--){
            System.out.print(" "+arr[i]);

         }
        

    }
}
