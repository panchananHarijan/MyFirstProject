package com.practic.hadfree;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> emp= Arrays.asList(
                new Employee(1, "Alice", "HR", 60000),
                new Employee(2, "Bob", "IT", 45000),
                new Employee(3, "Charlie", "IT", 70000),
                new Employee(4, "David", "Finance", 55000),
                new Employee(5, "Eve", "HR", 40000),
                new Employee(6, "Frank", "Finance", 80000),
                new Employee(7, "Grace", "IT", 90000));

        // 1. Find all employees with a salary > 50,000 and sort by salary (descending)
        List<Employee> highSalaryEmployee=emp.stream().filter(s->s.getSalary()>50000)
                .sorted(Comparator.comparingDouble(Employee::getSalary)
                        .reversed()).toList();
        highSalaryEmployee.forEach(System.out::println);

        //2.Group employees by department and calculate the average salary for each department.
        Map<String,Double> avgSalaryDept=emp.stream().collect(Collectors.groupingBy(Employee::getDept
                ,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Average Salary by Dept");
       avgSalaryDept.forEach((dept,salary)->System.out.println(dept+":"+salary));


       // 3. Retrieve names of all employees in the "IT" department
        System.out.println("ALL it Employee Name");
        List<String> allItEmployee=emp.stream().filter(m->m.getDept().equalsIgnoreCase("IT"))
                .map(Employee::getName).toList();
        allItEmployee.forEach(System.out::println);

        //4. Retrieve details of all employees in the "IT" department
        System.out.println("ALL it employee details");
        List<Employee> itEmpDetails=emp.stream().filter(c->c.getDept().equalsIgnoreCase("IT")).toList();
        itEmpDetails.forEach(System.out::println);

        //Find details of Employee more then Average Salary
        System.out.println("More then Avg salary emp details");
        double averageSalary = emp.stream().mapToDouble(m -> m.getSalary()).average().orElse(0);
        List<Employee> empMoreavgSalary=emp.stream().filter(n->n.getSalary()>averageSalary).toList();
        empMoreavgSalary.forEach(System.out::println);



    }







}
