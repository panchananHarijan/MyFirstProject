package com.DS;

public class CheckNumberIsPrime {

    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(i%2==0){
                return false;
            }


        }
        return true;


    }
    public static void main(String[] args) {
        int num=29;
        isPrime(num);

    }
}
