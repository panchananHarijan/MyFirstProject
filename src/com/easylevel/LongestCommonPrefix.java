package com.easylevel;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        //op=fl
        String [] arr={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] str){
        if(str.length==0 ||str==null){
            return "";
        }
        String prefix=str[0];
        for(int i=1;i<str.length;i++){
            while (str[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }


}
