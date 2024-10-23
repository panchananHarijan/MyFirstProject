package com.basic;

public class FindLognestName {
    public static void main(String[] args) {
        String[] names = {"Alice", "Jonathan", "Christopher", "Kate"};
        String longestname=findLongestName(names);
        System.out.println(longestname);
    }

    public static String findLongestName(String[] names){
        String longestName="";
        for(String name:names){
            if(name.length()>longestName.length()){
                longestName=name;
            }
        }
        return longestName;

    }
}
