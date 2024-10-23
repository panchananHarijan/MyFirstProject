package com.pdfquestionresolve;
//Find sum of first n numbers
public class SumOfGivenNum {
    public static void main(String[] args) {
        int n=10;
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Total number of sum is:"+sum);
    }
}
