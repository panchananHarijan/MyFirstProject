package com.java8;

import java.util.stream.IntStream;

public class PalindromUsingJava8 {
    public static void main(String[] args) {
        System.out.println( checkPalindrom("ROTATOR"));
        String str = "ROTATOR";
        boolean ispelindrom=IntStream.range(0,str.length()-1).
                noneMatch(i->str.charAt(i)!=str.charAt(str.length()-i-1));

       if(ispelindrom){
           System.out.println("ok");
       }
       else{
            System.out.println("not ok");
        }
    }


    public static boolean checkPalindrom(String str){
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
