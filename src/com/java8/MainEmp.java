package com.java8;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainEmp {
    public static void main(String[] args) {
        List<Employee> emp=new ArrayList<>();

        Employee e1=new Employee();
        e1.setId(51);
        e1.setCity("Hyderabad");
        e1.setName("panchu");

        Employee e2=new Employee();
        e2.setId(12);
        e2.setCity("Banglore");
        e2.setName("raghu");

        Employee e3=new Employee();
        e3.setId(15);
        e3.setCity("Hyderabad");
        e3.setName("Muni");

        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        Map<String,List<Employee>> empMap=emp.stream().filter(e->e.getCity()!=null).collect(Collectors.groupingBy(Employee::getCity));

        empMap.forEach((key,value)-> System.out.println("City:"+key+" Employee"+value));

    }




    }




