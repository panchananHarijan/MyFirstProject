package com.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("Rama",50,"Math"));
        list.add(new Student("Rama",60,"physics"));
        list.add(new Student("Rama",45,"English"));

        list.add(new Student("Hari",70,"Math"));
        list.add(new Student("Hari",65,"physics"));
        list.add(new Student("Hari",85,"English"));

        list.add(new Student("Gita",90,"Math"));
        list.add(new Student("Gita",55,"Physics"));
        list.add(new Student("Gita",80,"English"));

        //sum of the mark group of student

        Map<String, Integer> totalMarksByStudent = list.stream()
                .collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getMarks)));

        System.out.println(totalMarksByStudent);
        //Sort the mark descending order

        totalMarksByStudent.entrySet().stream().sorted((a,b)->b.getValue().compareTo(a.getValue())).forEach(entry-> System.out.println(entry.getKey()+" "+entry.getValue()));


    }
}
