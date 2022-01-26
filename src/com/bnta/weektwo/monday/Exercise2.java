package com.bnta.weektwo.monday;

import java.util.Locale;

/*
      Given the following String input
      String input = "   b ri   ght net   work  "
      Write a program that transforms input into: Bright Network
    */
public class Exercise2 {
    public static void main(String[] args) {

        String input = "   b ri   ght net   work  ";
        // Call the replaceAll() method
        // replaceAll("\\s", "");
        // where \\s is a single space in unicode

        input = input.replaceAll("\\s", ""); //Replacing all space \\s with ""
//        System.out.println(input);
//
//        char[] ch = new char[input.length()]; // creating an array of characters of the same length as input without spaces
//
//        for (int i = 0; i < input.length(); i++) {
//            ch [i] = input.charAt(i); // populating the characters array with the matching character from inpur without whitespaces
////            System.out.println(ch);

            // Insert a whitespace at position 6
            // turn the array into a string
            // use .substring to separate the two
            // Print

            String word1 = input.substring(0,6);
            String word2 = input.substring(6,input.length());

            String capWord1 = word1.substring(0,1).toUpperCase(Locale.ROOT) + word1.substring(1);
            String capWord2 = word2.substring(0,1).toUpperCase(Locale.ROOT) + word2.substring(1);

            System.out.println(capWord1 + " " + capWord2);
        }
    }
