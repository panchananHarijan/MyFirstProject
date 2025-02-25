package com.DS;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("Alice", 20, 88.5));
        students.add(new Student("Bob", 17, 95.0));
        students.add(new Student("Charlie", 19, 82.0));
        students.add(new Student("David", 22, 92.5));

        removeName(students,"David");
       findHeighestGrade(students);
        findStudentMoreThen18(students);
        findGradeSomeRange(students);
        groupingStudentByGrade(students);
    }

    //Remove a student by their name.
    public static void removeName(List<Student> student,String name){
        student.removeIf(students->students.getName().equals(name));
    }

    //Find and print the student with the highest grade.
    public static Student findHeighestGrade(List<Student> students) {
        return students.stream().max(Comparator.comparing(Student::getGrade)).orElse(null);
    }

    //Print all students who are above the age of 18.
    public static void findStudentMoreThen18(List<Student> students){
        List<Student> collect = students.stream().filter(m -> m.getAge() > 18).collect(Collectors.toList());
        for(Student st:collect){
            System.out.println(st);
        }

    }

    //You have a list of students, and you need to find all students whose grades fall between 80 and 90

    public static void findGradeSomeRange(List<Student> students){
        List<Student> grade=students.stream().filter(n->n.getGrade()>=80 && n.getGrade()<=90).collect(Collectors.toList());
        for(Student gra:grade){
            System.out.println(gra);
        }
    }


    //Grouping Students by Grade Range
       public static void groupingStudentByGrade(List<Student> students){

           Map<String, List<Student>> groupedByGrade = students.stream()
                   .collect(Collectors.groupingBy(student -> {
                       if (student.getGrade() >= 90) {
                           return "Excellent";
                       } else if (student.getGrade() >= 80) {
                           return "Good";
                       } else {
                           return "Need to Improve";
                       }
                   }));

           //display the group of student
           groupedByGrade.forEach((gradecategary,student)->{
               System.out.println(gradecategary+" :");
               student.forEach(s-> System.out.println(s));
           });
       }
}
