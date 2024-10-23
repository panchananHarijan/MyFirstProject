package com.basic;

import java.util.HashMap;
import java.util.Map;

public class TargetSumIndices {
    public static void main(String[] args) {
        // Example array of integers
        int[] numbers = {2, 7, 11, 15};
        int targetSum = 22;

        // Call the method to find the indices
        int[] result = findTwoSum(numbers, targetSum);

        // Print the result
        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two numbers add up to the target sum.");
        }
    }

    // Method to find indices of two numbers that add up to targetSum
    public static int[] findTwoSum(int[] nums, int target) {
        // Create a map to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Find the complement of the current number

            // Check if the complement is already in the map
            if (map.containsKey(complement)) {
                // Return the indices of the two numbers that add up to the target
                return new int[] { map.get(complement), i };
            }

            // Otherwise, add the current number and its index to the map
            map.put(nums[i], i);
        }

        // Return an empty array if no solution is found
        return new int[0];
    }
}
