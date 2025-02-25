package com.easylevel;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str="Hello World";
        findLengthOfLastWord(str);
    }

    public static void findLengthOfLastWord(String str){
        String[] split = str.split(" ");
       String word=split[split.length-1];
       int length=word.length();
        System.out.println(length);



    }


}
