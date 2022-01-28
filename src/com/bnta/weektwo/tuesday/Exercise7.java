package com.bnta.weektwo.tuesday;
/*
        Write a method that finds the longest string in any given array.
        i.e. [] -> ""
        i.e. ["hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
    */

    /*
        1) Create a function that finds the max length of the longest string in an array of strings
        2) Create a function which prints the strings that match the max length of longest string in the array
     */
public class Exercise7 {
        public static void main(String[] args) {

            String[] strings = {"hello", "hello" ,"ola", "ciao"}; // String array to be used

            int maxChar = getMaxLength(strings); // Populating an int variable with the no. of characters from longest string

            for (int i = 0; i < strings.length; i++) { // Created a for loop to go through the string array
                if (maxChar == strings[i].length()) { // If the length of the string matches the max length, it will be printed
                    System.out.println(strings[i]);
                }
            }


        }

        public static int getMaxLength(String[] array) { // Creating a function to determine the length of the longest string in array
            int maxLength = 0;                          // Created a placeholder int variable which will be populated by the length of longest string
            for (String s : array) {                    // Created a for loop that will go through each string in the string array
                if (s.length() > maxLength) {           // If the string length is longer than the current maxLength, maxLength will be populated with length of given string
                    maxLength = s.length();             // For loop goes through every string and updates the variable if it is larger than previous max
                }
            }
            return maxLength; // Returns the number of characters in the longest string from the array
        }

    }