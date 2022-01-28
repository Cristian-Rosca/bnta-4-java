package com.bnta.weektwo.thursday.methods;

/*
Write a method which takes two numbers as arguments and prints one of:

"The first number is larger"
"The second number is larger"
"The numbers are equal"

 */

import java.util.Scanner;

public class MethodsExercise4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your first number below:");
        int number1 = scanner.nextInt();

        System.out.println("Input your second number below:");
        int number2 = scanner.nextInt();

        System.out.println(comparison(number1,number2));

    }

    public static String comparison (int num1, int num2) {
        String answer = "";
            if (num1 > num2) {
                answer = "The first number is larger";
            }
            else if (num1 < num2) {
                answer = "The second number is larger";
            }
            else answer = "The numbers are equal";

            return answer;
    }

}
