package com.pdfquestionresolve;
//Program to print character position count in a given string
public class LetterPositionCount {
    public static void main(String[] args) {
        String s = "CANDIDJAVA";
        char[] arr=s.toCharArray();
        int i=1;
        for(char a:arr){
            System.out.println(a+" ="+" "+i);
            i++;
        }
    }
}
