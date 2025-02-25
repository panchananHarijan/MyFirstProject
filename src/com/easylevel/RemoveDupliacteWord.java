package com.easylevel;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupliacteWord {
    public static void main(String[] args) {
        String str="Hi My name is panchanan Hi";
        System.out.println(removeDupliacte(str));

    }

    public static String removeDupliacte(String str){
        String[] words=str.split(" ");
        Set<String> hashSet=new LinkedHashSet<>();
        for(String word:words){
            hashSet.add(word);
        }
        return String.join(" ",hashSet);

    }
}
