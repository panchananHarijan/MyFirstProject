package com.pdfquestionresolve;

public class PrimeNumberUpto100 {
    public static void main(String[] args) {
        int limit=100;
        int count=0;
        for(int i=2;i<=limit;i++){
            if(isPrime(i)){
                System.out.println("number are="+i);
                count++;
            }
        }
        System.out.println("Total number of prime number:"+count);
    }
    public static boolean isPrime(int num){
         if(num<=1){
             return false;
         }
         for(int i=2;i<=Math.sqrt(num);i++){
             if(num%2==0){
                 return false;
             }
         }
         return true;
    }
}
