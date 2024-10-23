package com.pdfquestionresolve;
//Program to check the given number is Palindrome or not
public class PelindromCheck {
    public static void main(String[] args) {
        int num=121;
        int pal=num;
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==pal){
            System.out.println("Pelindrom");
        }
        else {
            System.out.println("not");
        }

    }
}
