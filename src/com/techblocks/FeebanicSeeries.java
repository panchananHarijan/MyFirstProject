package com.techblocks;

public class FeebanicSeeries {

    public static long[] generateFeebanicSeeries(int a){
              long[] fib=new long[a];
              fib[0]=1;
              fib[1]=1;
              for(int i=2;i<a;++i){
                  fib[i]=fib[i-2]+fib[i-1];
              }
              return fib;
    }
    public static void main(String[] args) {
        int a=10;
        long[] fib = generateFeebanicSeeries(a);
        for (int i=0;i<a;i++){
            System.out.print(Long.toUnsignedString(fib[i])+" ");
        }

    }
}
