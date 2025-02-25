package com.practic.hadfree;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindEvenNumber$MaxValue {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12, 7, 10, 23, 34, 5, 50);

        //1.find even max number
        Integer result=list.stream().filter(n->n%2==0).max(Integer::compareTo).get();
        System.out.println(result);

        //Group word by length
        List<String> lst=Arrays.asList("Java", "Stream", "API", "Lambda", "Example");
        Map<Integer, List<String>> collect = lst.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect);

        //Flatten a List of Lists

        System.out.println("Flat map to map convert");
        List<List<Integer>> listofList=Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9));

        List<Integer> map=listofList.stream().flatMap(List::stream).toList();
        map.forEach(System.out::println);



    }
}
