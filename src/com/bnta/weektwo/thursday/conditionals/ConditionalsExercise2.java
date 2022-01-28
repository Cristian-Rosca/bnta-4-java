package com.bnta.weektwo.thursday.conditionals;

// create an string variable
// create a second string variable which has the same value as the first
// create an `if` statement which compares the two variables and prints to the console if they are equal

import java.util.Scanner;

public class ConditionalsExercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Variable 1");
        String word1 = scanner.nextLine();

        System.out.println("Variable 2");
        String word2 = scanner.nextLine();

        if (word1.equals(word2)) {
            System.out.println("The words are equal");
        }
        else System.out.println("The words are not equal");
    }

}
