package com.easylevel;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacterInString {
    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(findUniqueCharacter(str));
    }

    public static Character findUniqueCharacter(String str){
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        int nonRepeatCount=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.get(ch)==1){
                nonRepeatCount++;
                if(nonRepeatCount==2){
                    return ch;
                }

            }
        }
        return null;
    }



}
