package com.designpattern.factory;

public class Employeefactory {

    public static Employee createEmployee(String type){
        if (type.equals("developer")){
            return new Developer();
        } else if (type.equals("tester")) {
            return new Tester();
        } else if (type.equals("manager")) {
            return new Manager();
        }
        else {
            return null;
        }
    }
}
