package com.bnta.weektwo.tuesday;

import java.util.Scanner;

/*
      Write a program that takes an input number from the console and prints if number is prime
      Create a method to check if number is prime then use against the input
    */
public class Exercise4 {
    public static void main(String[] args) {

        // create a scanner that takes input from user

        // first create a sample variable to test

        Scanner scanner = new Scanner (System.in);

        System.out.println("Input a number below to check if it is prime:");
        int input = scanner.nextInt();

        System.out.println(isPrime(input));
    }

    // Create an isPrime method

    static public boolean isPrime(int input) {
        if (input == 0 || input == 1) {   // Check if number is 1 or 0
            return false;
        } else if (input == 2) { //Check if number is 2
            return true;
        } else if (input % 2 == 0) {// Check if number can be divided by 2
            return false;
        } else
            for (int i = 3; i <= Math.sqrt(input); i += 2)  // CODE COPIED FROM GEEKSFORGEEKS -> Didn't quite get the maths yet
        {
            if (input % i == 0)
                return false;
        }
            return true;

    }
}