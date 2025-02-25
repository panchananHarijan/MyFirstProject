package com.employee;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {
       List<Integer> list= Arrays.asList(10, 15, 20, 25, 30, 35);

       List<Integer> even=list.stream().filter(n->n%2==0).collect(Collectors.toList());
       // System.out.println(even);//10,20,30

        List<Employee> emp=EmployeeDao.getEmplyeeDetails().stream().sorted((e1,e2)-> Math.toIntExact(e2.getSalary()-e1.getSalary())).collect(Collectors.toList());
       // System.out.println(emp);
       // EmployeeDao.getEmplyeeDetails().stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

       // EmployeeDao.getEmplyeeDetails().stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);

     Integer secondvalue=list.stream().sorted((a, b)->b-a).skip(1).findFirst().get();
        //System.out.println(secondvalue);

       Employee secondSalary= EmployeeDao.getEmplyeeDetails().stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().orElse(null);

       // System.out.println(secondSalary);
        Integer num=list.stream().max(Integer::compareTo).orElse(null);
        Integer min=list.stream().min(Integer::compareTo).orElse(null);
        //System.out.println(num);
        //System.out.println(min);

       Map<String,List<Employee>> group= EmployeeDao.getEmplyeeDetails().stream().collect(Collectors.groupingBy(Employee::getDept));
       // System.out.println(group);

        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
       Map<String, Long> count= words.stream().collect(Collectors.groupingBy(word->word,Collectors.counting()));
       // System.out.println(count);

        //find duplicate element
        List<Integer> lst=Arrays.asList(1, 2, 3, 4, 5, 2, 6, 3, 7, 8, 1);
        Set<Integer> hashSet=new HashSet<>();
        Set<Integer> set=lst.stream().filter(a->!hashSet.add(a)).collect(Collectors.toSet());
        System.out.println(set);



    }
}
