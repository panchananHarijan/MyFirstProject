package com.easylevel;

public class StringCheckPelindrom {
    public static void main(String[] args) {
        String str="MADAMA";
        System.out.println(isPelindrom(str));

    }

    public static boolean isPelindrom(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
