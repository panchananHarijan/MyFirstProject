package com.leetcode;

import java.util.Arrays;

public class LongestCommanPrefix {
//    public static void main(String[] args) {
//        String[] str={"flower","flow","flight"};
//        //output=fl
//        //String st={"dog","racer","car"};
//        //output="";
//        System.out.println(  longestCommonPrefix(str));
//
//    }
//
//
//    public static String longestCommonPrefix(String[] str){
//        if(str.length==0){
//            return "";
//        }
//        int length=str[0].length();
//        for (int i=1;i<str.length;i++){
//            length=Math.min(length,str[i].length());
//
//            for(int j=0;j<length;j++){
//                char c=str[0].charAt(j),d=str[1].charAt(j);
//                if(c!=d){
//                    length=j;
//                    break;
//                }
//            }
//        }
//        return str[0].substring(0,length);
   // }
public static void main(String[] args) {

    String [] arr={"flower","flew","floor"};
    System.out.println(longestCommonPrefix(arr));
}

    static String longestCommonPrefix(String[] a)
    {
        int size = a.length;

        /* if size is 0, return empty string */
        if (size == 0)
            return "";

        if (size == 1)
            return a[0];

        /* sort the array of strings */
        Arrays.sort(a);

        /* find the minimum length from first and last string */
        int end = Math.min(a[0].length(), a[size-1].length());

    /* find the common prefix between the first and
       last string */
        int i = 0;
        while (i < end && a[0].charAt(i) == a[size-1].charAt(i) )
            i++;

        String pre = a[0].substring(0, i);
        return pre;
    }

}
