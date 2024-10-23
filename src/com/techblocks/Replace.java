package com.techblocks;

public class Replace {
    public static void main(String[] args) {
        String str="1.1.1.1";
        replace(str);
    }

    public static void replace(String str){
        String s = str.replace(".", "[.]");
        System.out.println(s);
    }
}
