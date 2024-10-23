
package com.basic;

public class FibanicSeeries {
    public static void main(String[] args) {
       int num=12;
       getFibanicNumber(num);
       foundFibanicNumber(num);
    }

    public static  void getFibanicNumber(int num){
        int a=0;
        int b=1;
        for(int i=0;i<num;i++){
            System.out.print(a+",");
            int nextTerm=a+b;
            a=b;
            b=nextTerm;
        }

    }

    public static void foundFibanicNumber(int index){
        int previous=0;
        int next=1;
        int result=0;
        for(int i=0;i<=index;i++){
            System.out.print(previous+" ");
            previous=next;
            next=result;
        }

    }
}
