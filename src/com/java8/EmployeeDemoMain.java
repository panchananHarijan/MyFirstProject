package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeDemoMain {
    public static void main(String[] args) {
        List<EmployeeDemo> emp = new ArrayList<>();
        emp.add(new EmployeeDemo(101, "Panchu", 30000.90, "hyderbad"));
        emp.add(new EmployeeDemo(67, "Hemant", 20000.90, "delhi"));
        emp.add(new EmployeeDemo(76, "Kumar", 49000.90, "Banglore"));
        emp.add(new EmployeeDemo(120, "Aamu", 78000.90, "kanada"));

        System.out.println(emp);
        Collections.sort(emp,(o1,o2)-> (int) (o1.getSalary()-o2.getSalary()));
        System.out.println(emp);

    }
}
/*class mycomprator implements Comparator<EmployeeDemo>{

    @Override
    public int compare(EmployeeDemo o1, EmployeeDemo o2) {
        return o1.getName().compareTo(o2.getName());
    }
}*/



