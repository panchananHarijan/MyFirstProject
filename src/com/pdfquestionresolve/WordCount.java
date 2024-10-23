package com.pdfquestionresolve;
//Program to count number of words in given string
public class WordCount {
    public static void main(String[] args) {
        String s = "welcome to candid java tutorial";
        /*String s = "welcome to candid java tutorial";
        int count=0;
        String[] s1 = s.split(" ");
        for(String result:s1){
            count++;
        }
        System.out.println(count);*/
        int count=1;
        for (int i=0;i<=s.length()-1;i++){
            if((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
                count++;
            }
        }
        System.out.println(count);
    }
}
