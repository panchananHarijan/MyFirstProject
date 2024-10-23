package com.pdfquestionresolve;

public class PalindromeUptoN {
    public static void main(String[] args) {
        int limit=50;
        int rev=0;
        for(int i=1;i<=limit;i++){
            int n=i;
            while(n>0){
              int rem=n%10;
              rev=rev*10+rem;
              n=n/10;
            }
            if(rev==i){
                System.out.println("pelindrom number are:"+i);
            }
             rev=0;
        }
    }
}
