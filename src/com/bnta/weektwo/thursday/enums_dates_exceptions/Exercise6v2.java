package com.bnta.weektwo.thursday.enums_dates_exceptions;

// try catch
// write a program that converts program arguments to and integer
// if value cannot be converted to int store them somewhere
// calculate sum for numbers that can be converted to an integer
// finally print the numbers that cannot be converted to an int
// example: java com.bnta.exercises.week_two_wed.exercises.Exercise6 1 2 a b foo 3
// output: Sum: 5 and a, b, foo are not numbers.

import java.util.Arrays;

public class Exercise6v2 {
    public static void main(String[] args) {

        String [] stringsToInt = {"1", "2", "a", "b", "foo", "3"};

        int intSum = 0;

        String [] array = {};
        String [] errors = {};

        for (int i = 0; i < stringsToInt.length; i++) {
            try {
                int inputInteger = Integer.parseInt(stringsToInt[i]);
                intSum = intSum + inputInteger;

            } catch (Exception e) {
                errors = Arrays.copyOf(array, array.length + 1); // Need to figure out a way to create an array containing number of elements that are not integers, and then populate that with teh strings
                errors [errors.length-1] = stringsToInt[i];

                System.out.println(e + " " + stringsToInt[i] + " is not an integer");
            }
        }

        System.out.println(intSum);

        System.out.println(Arrays.toString(errors));

    }
}
