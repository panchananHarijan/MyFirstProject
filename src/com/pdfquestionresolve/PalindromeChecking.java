package com.pdfquestionresolve;
//Program to reverse the string and check whether it is palindrome or not
public class PalindromeChecking {
    public static void main(String[] args) {
        String inpstr ="AMMA";
        String temp=inpstr;
        String rev="";
        for(int i=inpstr.length()-1;i>=0;i--){
            rev=rev+inpstr.charAt(i);

        }
        if(temp.equals(rev)){
            System.out.println("Strig are pelindrom");
        }
        else{
            System.out.println("not pelindrom");
        }
    }

}
