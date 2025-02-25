package com.easylevel;

public class PalindromCheck {
    public static void main(String[] args) {

    }
    public static boolean checkPelindrom(String num){
        int left=0;
        int right=num.length()-1;
        while (left<right){
            if(num.charAt(left)!=num.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isPelindrom(int x){
        if(x<0){
            return false;

        }
        String num=x+"";
        return checkPelindrom(num);
    }
}
