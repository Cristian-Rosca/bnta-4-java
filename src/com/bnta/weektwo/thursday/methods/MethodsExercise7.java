package com.bnta.weektwo.thursday.methods;

/*
Write a method which takes a sentence as an argument,
counts the number of words in the array and prints "The sentence contains X words".

 */

import java.util.Arrays;
import java.util.Scanner;

public class MethodsExercise7 {
    public static void main(String[] args) {

        wordCount("this many words");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your sentence below and I will count the words:");
        String userInput = scanner.nextLine();

        System.out.println("The sentence has " + charCount(userInput) + " characters");

        System.out.println("The sentence has " + wordCount(userInput) + " words");

    }

    public static int charCount (String userSentence) {
        int sentenceChar = userSentence.length();
        return sentenceChar;
    }

    public static int wordCount (String userSentence) {
        String [] wordArray = userSentence.split("\\s+"); // Make sure to remember that symbol for 'space' is backslash, not forward slash
        return wordArray.length;

    }

}

