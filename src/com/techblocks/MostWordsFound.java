package com.techblocks;

import java.util.Arrays;

public class MostWordsFound {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
       mostWordFound(sentences);

    }

    public static int mostWordFound(String[] sentences) {
        int maxLength = 0;
        for (String str : sentences) {
            int currentLenth = str.split(" ").length;
            if (maxLength < currentLenth) {
                maxLength = currentLenth;
            }
        }
        System.out.println(maxLength);
        return maxLength;
    }
}


