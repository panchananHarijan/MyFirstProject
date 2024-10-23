package com.pdfquestionresolve;
//Total number of odd numbers between 1 -100
public class TotalNumOfOddNum {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                count++;
            }
        }
        System.out.println("Total number of odd number count is:"+count);

    }
}
