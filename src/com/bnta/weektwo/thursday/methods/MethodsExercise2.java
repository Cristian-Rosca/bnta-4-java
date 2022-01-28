package com.bnta.weektwo.thursday.methods;

import java.util.Scanner;

/*

Write a method which takes a number as an argument and returns that number negated,
e.g. passing 5 as an argument should return -5; passing -10 should return 10.

 */
public class MethodsExercise2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("input your nunber to negate:");
        int input = scanner.nextInt();

        System.out.println(negateNumber(input));

    }

    public static int negateNumber (int num1) {
        int negativeNum1 = 0;
        if (num1 >= 0) {
            negativeNum1 = num1 * -1;
        } else negativeNum1 = num1;

        return negativeNum1;
    }

}
