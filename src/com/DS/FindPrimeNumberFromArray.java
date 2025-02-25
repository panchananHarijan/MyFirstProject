package com.DS;

public class FindPrimeNumberFromArray {
    public static int primeCount(int[] numbers){
        int count=0;
        for(int num:numbers){
            if(isPrime(num)){
                count++;
            }
        }
        return count;

    }
    public static boolean isPrime(int num){
        if(num<=1){
            return false;

        }
        for(int i=2;i*i<num;i++){
            if(num%i==0){
                return false;

            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[] numbers = {10, 11, 13, 17, 18, 20, 23, 29, 30, 31};
        int result=primeCount(numbers);
        System.out.println("prime count is::"+result);
    }
}
