package com.basic;

public class TimeComplexityCheck {
    public static void main(String[] args) {
       double now= System.currentTimeMillis();
        System.out.println(findSum(999999999));
        System.out.println("TimeTaken"+(now-System.currentTimeMillis())+" Millisecond");


    }

    public static int findSum(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        return sum;
    }

    /*public static Double findSum2(double num){
        return num*(num+1)/2;
    }*/
}
