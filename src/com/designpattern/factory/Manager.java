package com.designpattern.factory;

public class Manager implements Employee{
    @Override
    public void work() {
        System.out.println("manager managing the team");
    }
}
