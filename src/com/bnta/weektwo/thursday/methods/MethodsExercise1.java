package com.bnta.weektwo.thursday.methods;

/*
Write a method which takes two numbers as arguments and prints their sum to the terminal.
 */

import java.util.Scanner;

public class MethodsExercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Make sure to include System.in in the braces after new Scanner

        System.out.println("Input Number 1 below:");
        int number1 = scanner.nextInt();

        System.out.println("Input Number 2 below:");
        int number2 = scanner.nextInt();

        int output = sumIntegers(number1,number2);

        System.out.println(output);

    }

    public static int sumIntegers (int num1, int num2) {
        int numTotal = num1 + num2;
        return numTotal;
    }

}
