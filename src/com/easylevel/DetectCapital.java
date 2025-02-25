package com.easylevel;

public class DetectCapital {
    public static void main(String[] args) {
        String str="Flag";
        System.out.println(detectcapital(str));
    }

    public static boolean detectcapital(String word){
       if(allCaps(word)|| allLower(word) || titleCase(word)){
           return true;
       }
       return false;
    }
    private static boolean allCaps(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                count++;
            }
        }
        if(str.length()==count){
            return true;
        }
        return false;
    }

    private static boolean allLower(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLowerCase(ch)){
                count++;
            }
        }
        if(str.length()==count){
            return true;
        }
        return false;
    }

    private static boolean titleCase(String str){
        char ch=str.charAt(0);
        String sub_str=str.substring(1);
        if(Character.isUpperCase(ch) && allLower(sub_str)){
            return true;
        }
        return false;
    }
}
