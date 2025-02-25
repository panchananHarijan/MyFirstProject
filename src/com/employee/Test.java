package com.employee;

public class Test {
    public static void main(String[] args) {
        String  str = "harijanpanchanan9321verkito";
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch >= 'a' &&  ch  <= 'z' ){

                if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                    System.out.print(ch);
                }

            }
        }
    }
}
