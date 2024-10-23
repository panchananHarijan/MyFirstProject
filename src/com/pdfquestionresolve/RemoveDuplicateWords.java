package com.pdfquestionresolve;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String input = "Welcome to Java Session Session Session";
        String result=removeDupliace(input);
        System.out.println("String after removing duplicate::"+result);

    }

    public static String removeDupliace(String input){
        String[] str=input.split(" ");
        Set<String> hasSet=new HashSet<>();
        for (String st:str){
            hasSet.add(st);
        }
        StringBuilder sb=new StringBuilder();
        for(String mn:hasSet){
            sb.append(mn).append(" ");
        }
        return sb.toString().trim();

    }
}
