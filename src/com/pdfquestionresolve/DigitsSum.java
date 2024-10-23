package com.pdfquestionresolve;
//Find the sum of the digits of a number
public class DigitsSum {
    public static void main(String[] args) {
        int num=251025;
        int temp;
         temp=num;
         int sum=0;
         while(num>0){
          int rem=num%10;
              sum=sum+rem;
              num=num/10;
         }
        System.out.println("sum of digit of temp value is:"+sum);



    }
}
