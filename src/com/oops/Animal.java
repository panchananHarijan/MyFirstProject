package com.oops;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public  abstract class Animal {

    void eat() {
        System.out.println("Tiger meat eatimg");
    }
    public abstract void sleep();

    public abstract void run();

}
class Tiger extends Animal{

    @Override
    public void sleep() {
        System.out.println("Tiger sleep in cave");
    }

    @Override
    public void run() {
        System.out.println("Tuger runninh");
    }
    public void drink(){
        System.out.println("drink");
    }
}

class Rabit extends Animal{

    @Override
    public void sleep() {

    }

    @Override
    public void run() {

    }
}

class MainTest{
    public static void main(String[] args) {
        Tiger an=new Tiger();
        an.eat();
        an.sleep();
        an.run();
        an.drink();
    }
}
