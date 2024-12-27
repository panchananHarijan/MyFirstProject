package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FromListFindStartWithAndSorted {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("John", "Jane", "Steve", "Lucy");
        List<String> namelist = list.stream().filter(s -> s.startsWith("J")).sorted().toList();

        namelist.forEach(System.out::println);
        //Find sum of even number square

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sum = numbers.stream().filter(m -> m % 2 == 0).map(m -> m * m).reduce(Integer::sum).get();
        System.out.println(sum);

        //null checking
        Optional<Object> nullcheck = Optional.ofNullable("panchu");
        nullcheck.ifPresentOrElse(m->System.out.println("Name is:"+m),()->System.out.println("name is not available"));




    }
}
