package com.leetcodepractic;

public class Parent {
    Parent() {
        this("Constructor");
        System.out.println("Parent Class default constr");
    }

    Parent(String s) {
        System.out.println("Parent Class param " + s);
    }
}

class Child extends Parent {
    Child() {
        this("Constructor");
        System.out.println("Child Class default constr");//1
    }

    Child(String s) {
        System.out.println("Child Class param" + s);
    }

    public static void main(String[] args) {
        Child obj = new Child();
    }
}