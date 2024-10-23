package com.pdfquestionresolve;
//Program to print reversed string by word in given line
public class ReverseWord {
    public static void main(String[] args) {
        String input="Welcome to Java Session";
        String[] str=input.split(" ");
        String rev="";
        for(int i=str.length-1;i>=0;i--){
            rev=rev+str[i]+" ";
//            if(i>0){
//                rev=rev+" ";
//            }
        }
        System.out.println(rev);
    }
}
