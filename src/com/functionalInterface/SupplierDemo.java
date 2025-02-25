package com.functionalInterface;

import java.util.function.Supplier;

public class SupplierDemo  {


    public static void main(String[] args) {
       Supplier<String> supplier=()-> {
            return "Hello Welcome to Hyderabad";
        };
        System.out.println(supplier.get());

    }

}
