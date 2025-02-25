package com.easylevel;

import java.util.stream.IntStream;

public class SumOfPrimeNumber {
    public static void main(String[] args) {
        primeSum(10);
     int limit=10;
       int result= IntStream.rangeClosed(2,limit).filter(SumOfPrimeNumber::isPrimes).sum();

    }
    public static boolean isPrimes(int num){
        return num<=1 && IntStream.rangeClosed(2,(int)Math.sqrt(num)+1).noneMatch(i->num%i==0);
    }

    public static void primeSum(int num){
        int sum=0;
        for(int i=2;i<=num;i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

}
