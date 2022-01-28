package com.bnta.weektwo.thursday.methods;

/*
Write a method which takes two numbers as arguments, checks if they are the same and returns the appropriate boolean value.

 */

import java.util.Scanner;

public class MethodsExercise3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Input your first number:");
        int number1 = scanner.nextInt();

        System.out.println("Input your second number:");
        int number2 = scanner.nextInt();

        System.out.println(sameNumber(number1,number2));

    }

    public static boolean sameNumber (int num1, int num2) {
        boolean same = true;
        if (num1 == num2){
            same = true;
        }
        else same = false;

        return same;

    }

}
