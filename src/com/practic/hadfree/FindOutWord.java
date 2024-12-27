package com.practic.hadfree;

public class FindOutWord {
    public static void main(String[] args) {
        String str="WelcomeToHyderabadEveryone";
        int countWord=0;
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                countWord++;
            }
        }
        System.out.println(countWord);

    }
}
