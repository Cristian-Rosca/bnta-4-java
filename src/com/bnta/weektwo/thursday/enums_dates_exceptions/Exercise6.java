package com.bnta.weektwo.thursday.enums_dates_exceptions;

// try catch
// write a program that converts program arguments to and integer
// if value cannot be converted to int store them somewhere
// calculate sum for numbers that can be converted to an integer
// finally print the numbers that cannot be converted to an int
// example: java com.bnta.exercises.week_two_wed.exercises.Exercise6 1 2 a b foo 3
// output: Sum: 5 and a, b, foo are not numbers.

import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input an integer below");
        String userInput = scanner.nextLine();

        String [] array = {};
        String [] errors = {};

        int [] intArray = {};
        int [] intInputs = {};


        // convert input to integer
        try {
            int inputInteger = Integer.parseInt(userInput); // Integer.parseInt to convert string to int
            intInputs = Arrays.copyOf(intArray, intArray.length+ 1);
            intInputs [intInputs.length -1] = inputInteger;

        } catch (NumberFormatException e) {
            errors = Arrays.copyOf(array, array.length + 1);
            errors [errors.length-1] = userInput;

            System.out.println(e + " " + userInput + " is not an integer");;
        }

        System.out.println(Arrays.toString(errors));

        System.out.println(Arrays.toString(intInputs));


    }
}
