package com.pdfquestionresolve;
//Program to print Armstrong number between 1 to 1000
public class ArmstrongNumbers {
    public static void main(String[] args) {
        int sum=0;
        int num,limit=1000;
        for(int i=1;i<=limit;i++){
            num=i;
            while(num>0){
                int rem=num%10;
                 sum=sum+(rem*rem*rem);
                 num=num/10;
            }
            if(sum==i){
                System.out.println("Armstrong number are:"+i);
            }
            sum=0;

        }

    }
}
