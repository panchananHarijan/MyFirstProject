package com.leetcode;

public class MergeStringAlternative {
     public static String mergeAlternateWord(String word1,String word2){
         StringBuilder sb=new StringBuilder("");
         int len=word1.length()+word2.length();
         for(int i=0;i<len;i++){
             if(i<word1.length()){
                 sb.append(word1.charAt(i));
             }
             if(i<word2.length()){
                 sb.append(word2.charAt(i));
             }

         }
         return sb.toString();
     }

    public static void main(String[] args) {
        String word1="abc";
        String word2="pqr";
        System.out.println(  mergeAlternateWord(word1,word2));
    }
}
