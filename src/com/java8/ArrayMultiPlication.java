package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArrayMultiPlication {
    public static void main(String[] args) {
        Integer[] arr={4,2,3,5,6};
        List<Integer> list = Arrays.asList(arr);
        Optional<Integer> reduce = list.stream().reduce((a, b) -> a * b);
        if(reduce.isPresent()){
            System.out.println("ArrayTotalNumberMultiplay::"+reduce.get());
        }
        else{
            System.out.println("Array is empty");
        }
    }
}
