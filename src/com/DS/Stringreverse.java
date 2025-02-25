package com.DS;

public class Stringreverse {
    public static String stringReverse(String str){
        char[] ch=str.toCharArray();
        int left=0;
        int right=str.length()-1;
        while(left<right){
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;


        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String st="Hyderbada";
        stringReverse(st);
        System.out.println("reverse String::"+ stringReverse(st));

    }
}
