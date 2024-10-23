package com.pdfquestionresolve;
//Program to returning a string as reverse text
public class StringReverse {
    public static void main(String[] args) {
        String string = "Welcome to Java Programming and Dotnet Programming";
        String[] arr=string.split(" ");
        for(int i=arr.length;i>0;i--){
            System.out.print(arr[i-1]+" ");
        }
    }
}
