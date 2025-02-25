package com.employee;

import java.util.ArrayList;
import java.util.List;

//DBA Layer
public class EmployeeDao {

    public static List<Employee> getEmplyeeDetails(){
        List<Employee> emp=new ArrayList<>();
        emp.add(new Employee(176,"Roshan","IT",600000));
        emp.add(new Employee(388,"Bikash","CIVIL",900000));
        emp.add(new Employee(196,"Rakesh","IT",720000));
        emp.add(new Employee(470,"Bimal","DEFENCE",500000));
        emp.add(new Employee(430,"Mohan","DEFENCE",800000));
        emp.add(new Employee(624,"Sourav","CORE",400000));
        emp.add(new Employee(627,"Suman","CORE",560000));
        emp.add(new Employee(176,"Prakash","SOCIAL",1200000));
        return emp;

    }

}
