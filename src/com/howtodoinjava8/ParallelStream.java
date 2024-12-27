package com.howtodoinjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=10;i++){
            list.add(i);
        }
        System.out.println(list);
        Stream<Integer> integerStream = list.parallelStream();
         List<Integer> result=integerStream.filter((m)->m%2==0).toList();
         for(Integer md:result){
             System.out.println(md);
         }

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5,9,6,4,2,9,7);
         List<Integer> plrstream=numbers.parallelStream().map(m->m*m).toList();
        System.out.println(plrstream);

         List<Integer> strm=numbers.stream().map(n->n*n).toList();
        System.out.println(strm);


    }
}
