package com.leetcode;

public class PalindromCheck {
    public static void main(String[] args) {
        int x=121;//madam//radar
        System.out.println(isPalindrome(x));
        String str="madamN";
        palindromStringCheck(str);
        System.out.println( palindromFound(str));

    }


    public static boolean isPalindrome(int x){
         if(x<0){
             return false;
         }
         int reverse=0;
         int copy=x;
         while(copy>0){
             int digit=copy%10;
             reverse=reverse*10+digit;
             copy=copy/10;
         }

        return reverse==x;
    }

    public static void palindromStringCheck(String str){
        String newStr=str;
        String rev="";
        for(int i=newStr.length()-1;i>=0;i--){
            rev=rev+newStr.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("String is pelindrom");
        }
        else{
            System.out.println("Not pelindrom");
        }

    }

    public static  boolean palindromFound(String str){
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
