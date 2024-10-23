package com.pdfquestionresolve;
//Program to delete vowels in a given string
public class RemoveAllVovels {
    public static void main(String[] args) {
        String string = "Welcome to Candid Java Programming";
        string=string.replaceAll("[AaEeIiOoUu]", "");
        System.out.println(string);
    }
}
