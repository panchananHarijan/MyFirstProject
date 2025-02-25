package com.designpattern;

//builder pattern

public class EmployeeService {
    public void createEmployee(){
        Employee emp=new Employee.EmployeeBuilder()
                .setDept("IT")
                .setName("Panchu")
                .setDesignation("Software engineer")
                .setSalary(95000)
                .build();

        System.out.println(emp);
    }
}
