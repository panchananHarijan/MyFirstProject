package com.employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
       List<Employee> emp= EmployeeDao.getEmplyeeDetails();

       //Group employees by department and find the highest salary in each department

        //Map<String, Employee> highestPaidInEachDept = employees.stream()
        //            .collect(Collectors.groupingBy(
        //                Employee::getDepartment,
        //                Collectors.collectingAndThen(
        //                    Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
        //                    optionalEmployee -> optionalEmployee.orElse(null)
        //                )
        //            ));
      Map<String,Employee> groupByept=emp.stream().collect(Collectors.groupingBy(Employee::getDept
              ,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                      ,optionalEmployee->optionalEmployee.orElse(null))));

      groupByept.forEach((deartment,employee)->{
          System.out.println("department::"+deartment);
          if(employee!=null){
              System.out.println("heighest Paid::"+employee);
          }

      });
    }
}
