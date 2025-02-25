package com.employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaxService {


    public static List<Employee> evaluteTaxUser(String input) {
        return (input.equalsIgnoreCase("tax")) ?
                EmployeeDao.getEmplyeeDetails().stream().filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList()) :
                EmployeeDao.getEmplyeeDetails().stream().filter(emp -> emp.getSalary() <= 500000).collect(Collectors.toList());

    }

    public static void sortedEmployee(){
        List<Employee> emp=EmployeeDao.getEmplyeeDetails();
        emp.stream().sorted((s1,s2)->(int)(s1.getSalary()-s2.getSalary())).forEach(System.out::println);
        emp.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

        Collections.sort(emp,(o1,o2)->(int)(o1.getSalary()-o2.getSalary()));


    }

    public static void main(String[] args) {
        System.out.println(TaxService.evaluteTaxUser("non tax"));
        sortedEmployee();
    }
}

