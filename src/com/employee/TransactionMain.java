package com.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransactionMain {
    public static void main(String[] args) {
        List<Transaction> transactions =new ArrayList<>();
        transactions.add(new Transaction("Deposit", 500.00));
        transactions.add(new Transaction("Withdrawal", 200.00));
        transactions.add(new Transaction("Deposit", 300.00));
        transactions.add(new Transaction("Withdrawal", 150.00));
        transactions.add(new Transaction("Deposit", 200.00));

        // Group transactions by type and calculate the total amount for each type

        Map<String, Double> collect = transactions.stream().collect(Collectors.groupingBy(tran -> tran.getType(),
                Collectors.summingDouble(tran -> tran.getAmount())));

        System.out.println(collect);

    }
}
