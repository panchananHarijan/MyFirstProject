package com.designpattern.factory;

public class Main {
    public static void main(String[] args) {
        Employee emp=Employeefactory.createEmployee("developer");
        emp.work();
        Employee em2=Employeefactory.createEmployee("tester");
        em2.work();
        Employee em3=Employeefactory.createEmployee("manager");
        em3.work();

    }
}
