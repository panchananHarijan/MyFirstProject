package com.leetcode;

public class CheckPanagram {
    public static boolean checkIfPanagram(String str){
        boolean flag=false;
        for(char ch='a';ch<='z';ch++){
              boolean result=checkPanagram(ch,str);
              if(result==false){
                  flag=false;
                  break;

              }
              else{
                  flag=true;
              }
        }
        return flag;
    }

    public static boolean checkPanagram(char ch,String str){
        for(char c:str.toCharArray()){
            if(c==ch){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        String s= "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(  checkIfPanagram(s));

    }
}
