package com.functionalInterface;

import java.util.function.Predicate;

public class PredicateDemo {


    public static void main(String[] args) {
        Predicate<Integer> demo=(Integer integer)-> {
            if(integer%2==0){
                return true;
            }
            else{
                return false;
            }

        };
        System.out.println( demo.test(6));
    }
}
