package com.pdfquestionresolve;

public class PrimeNumberUptoN {
    public static void main(String[] args) {
        int limit = 100; // Upper limit to find prime numbers
        int sum = 0; // Variable to store the sum of prime numbers
        int count = 0; // Variable to count the number of prime numbers

        System.out.println("Prime numbers from 1 to " + limit + " are:");

        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                sum += i;
                count++;
            }
        }

        System.out.println();
        System.out.println("Sum of prime numbers: " + sum);

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of prime numbers: " + average);
        } else {
            System.out.println("No prime numbers found.");
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


}
