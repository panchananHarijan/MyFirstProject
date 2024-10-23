package com.basic;

public class FactorialNumber {
    public static void main(String[] args) {
        int num=5;
        getFactorial(num);
    }

    public static  void getFactorial(int index){
        int fact=1;
        if(index<1){
            System.out.println("Invalid Number");
        }
        else{
            for (int i=1;i<=index;i++){
                fact=fact*i;
            }
            System.out.print(fact+" ,");
        }
    }


}
