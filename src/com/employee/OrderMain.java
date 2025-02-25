package com.employee;

import java.util.ArrayList;
import java.util.List;

public class OrderMain {
    public static void main(String[] args) {
        List<Order> orders=new ArrayList<>();

        orders.add(new Order("O001", 150.00));
        orders.add(new Order("O002", 80.00));
        orders.add(new Order("O003", 120.00));
        orders.add(new Order("O004", 200.00));
        orders.add(new Order("O005", 50.00));

        //// Filter orders with amount greater than 100 and calculate the total amount

        double sum = orders.stream().filter(n -> n.getAmount() >= 100).mapToDouble(n -> n.getAmount()).sum();
        System.out.println("Total sum::"+sum);


        // Find the avarage
        double avarage = orders.stream().filter(n -> n.getAmount()>=100).mapToDouble(n -> n.getAmount()).average().orElse(0.0);

        System.out.println("Find avarage::"+avarage);

    }
}
