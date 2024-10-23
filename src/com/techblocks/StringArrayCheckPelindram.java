package com.techblocks;

public class StringArrayCheckPelindram {
    public static void main(String[] args) {
        String[] words = {"abc", "car", "madam", "racecar", "cool"};
        pelindromCheck(words);

    }

    public static void pelindromCheck(String[] words) {
        for (String word : words) {
            if (isPelindrom(word)) {
                System.out.println(word);
            }
        }
    }

    static boolean isPelindrom(String word) {
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if (word.charAt(start) != word.charAt(end))
                return false;
            start++;
            end--;


        }
        return true;

    }

}
