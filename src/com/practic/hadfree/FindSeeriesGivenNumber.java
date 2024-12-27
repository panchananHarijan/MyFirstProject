package com.practic.hadfree;

public class FindSeeriesGivenNumber {
    public static void main(String[] args) {
        int[] seeries= {2, 1, 3, 2, 4, 3}; // Given series
        int positon=7;//required for this position
        int nextNumbe;
        if(positon%2==1){
            nextNumbe=2+(positon-1)/2;
        }
        else{
            nextNumbe=positon/2;
        }
        System.out.println("The next number for tis seeries is::"+nextNumbe);
    }
}
