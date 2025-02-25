package com.functionalInterface;
@FunctionalInterface
interface  MyFunctioanl{

    String say(String name);
}

public class FunctionalInterfaceTest {
    public static void main(String[] args) {

        MyFunctioanl mn=(name)-> {
            return "Hello, "+name;
        };
        System.out.println(mn.say("panchu"));

    }
}
