package com.easylevel;

import java.util.HashMap;
import java.util.Map;

public class FirstUniquecharacterIndex {
    public static void main(String[] args) {
        String str="leetcode";
        System.out.println(findUniqueCharacterIndex(str));

    }

    public static int findUniqueCharacterIndex(String str){
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.get(ch)==1){
                return i;
            }
        }
        return -1;
    }
}
