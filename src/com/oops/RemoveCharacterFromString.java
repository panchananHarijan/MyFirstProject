package com.oops;

public class RemoveCharacterFromString {
    public static void main(String[] args) {
        String str="cheapTichi";
        removeChar(str,'c');
        removeFromAString(str,'c');

    }
    public static void removeChar(String str,char c){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                continue;
            }
            //System.out.print(str.charAt(i));
        }

    }
    public static void removeFromAString(String str,char c){
        StringBuilder newString=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=c){
                newString.append(str.charAt(i));
            }
        }
        System.out.println(newString.toString());
    }

    public static void removeFrom(String str,char c){
        String newString="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=c){
               newString+=str.charAt(i);
            }
        }
        System.out.println(newString.toString());
    }



}
