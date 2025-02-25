package com.designpattern;

public class Employee {
    private String name;
    private String dept;
    private String designation;
    private int salary;
    private String address;

    private Employee(EmployeeBuilder build){
        this.name=build.name;
        this.address=build.dept;
        this.salary=build.salary;
        this.designation=build.designation;
    }
    public String getName() {
        return name;
    }


    public String getDept() {
        return dept;
    }

    public String getDesignation() {
        return designation;
    }


    public int getSalary() {
        return salary;
    }


    public String getAddress() {
        return address;
    }

    public static class EmployeeBuilder {
        private String name;
        private String dept;
        private String designation;
        private int salary;

        public EmployeeBuilder setDept(String dept) {
            this.dept = dept;
            return this;
        }

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setDesignation(String designation) {
            this.designation = designation;
            return this;
        }

        public EmployeeBuilder setSalary(int salary) {
            this.salary = salary;
            return this;
        }

        @Override
        public String toString() {
            return "EmployeeBuilder{" +
                    "name='" + name + '\'' +
                    ", dept='" + dept + '\'' +
                    ", designation='" + designation + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        public Employee build(){
           return new Employee(this);
        }
    }


}
