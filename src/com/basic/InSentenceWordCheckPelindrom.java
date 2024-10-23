package com.basic;

public class InSentenceWordCheckPelindrom {
    public static void main(String[] args) {
        String input="my name is nitin and im can speak malayalam";
        String[] wordSplit=input.split(" ");
        for(String word:wordSplit){
            if(isPelindromCheck(word)){
                System.out.println(word);
            }
        }
    }
    public static boolean isPelindromCheck(String input){
        int l1=0;
        int l2=input.length()-1;
        while(l2 > l1){
           if(input.charAt(l1)!=input.charAt(l2)){
               return false;
           }
           l1++;
           l2--;
        }
      return true;
    }
}
