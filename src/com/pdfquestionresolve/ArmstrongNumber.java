package com.pdfquestionresolve;
//Java program to find Armstrong number
public class ArmstrongNumber {
    public static void main(String[] args) {

        int num=154;
        int sum=0;
        int temp=num;
        while(num>0){
            int rem=num%10;
            sum=sum+rem*rem*rem;
            num=num/10;

        }
        if(sum==temp){
            System.out.println("number are Armstrong");
        }
        else{
            System.out.println("not armstrong");
        }

    }
}
