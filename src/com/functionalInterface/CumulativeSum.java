package com.functionalInterface;

import java.util.Arrays;

public class CumulativeSum {
    public static void main(String[] args) {
        int[] input = {10, 3, 2, 1};
        int[] output = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            if (i == 0) {
                output[i] = input[i] + input[i + 1];
            } else if (i < input.length - 1) {
                output[i] = input[i] + input[i + 1];
            } else {
                output[i] = input[i]; // Last element remains the same
            }
        }

        System.out.println("Output: " + Arrays.toString(Arrays.copyOf(output, input.length - 1)));
    }
}
