package com.techblocks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class BasedOnTheStringIndexFind {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange", "grape", "kiwi","orange"};
        String target="orange";
        indexFound(array,target);

        Arrays.stream(array).filter(s->s.contains(target)).forEach(System.out::println);
        IntStream.range(0, array.length).filter(s->array[s].contains(target)).forEach(System.out::println);
    }

    public static void indexFound(String[] array,String target){
        List<Integer> list=new ArrayList<>();
        int index=0;
        /*for(int i=0;i<array.length;i++){
            if(array[i]==target){
                list.add(i);
            }
        }*/
        for(String value:array){
            if(value.equals(target)){
                list.add(index);
            }
            index++;
        }
        System.out.println(list);
    }


}
