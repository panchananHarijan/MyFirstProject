package com.basic;

public class StringPattern {
    public static void main(String[] args) {
        String input = "a2b10";
        String output = generatePattern(input);
        System.out.println("Output: " + output);
    }

    public static String generatePattern(String input) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < input.length()) {
            char letter = input.charAt(i); // Get the letter (a, b, etc.)
            i++;

            // Collect the number that follows the letter
            StringBuilder numBuilder = new StringBuilder();
            while (i < input.length() && Character.isDigit(input.charAt(i))) {
                numBuilder.append(input.charAt(i));
                i++;
            }

            int count = Integer.parseInt(numBuilder.toString()); // Convert the number to an integer

            // Append the letter 'count' times
            for (int j = 0; j < count; j++) {
                result.append(letter);
            }
        }

        return result.toString();
    }
}

