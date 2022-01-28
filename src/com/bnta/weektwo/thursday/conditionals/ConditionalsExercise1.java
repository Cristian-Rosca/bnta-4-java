package com.bnta.weektwo.thursday.conditionals;

// create an integer variable
// create a second integer variable
// create an `if` statement which compares the two variables and prints to the console if they are equal

import java.util.Scanner;

public class ConditionalsExercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Variable 1");
        int num1 = scanner.nextInt();

        System.out.println("Variable 2");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("The numbers are equal");
        }
        else System.out.println("The numbers are not equal");

    }
}
