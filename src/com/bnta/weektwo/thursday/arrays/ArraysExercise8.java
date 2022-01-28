package com.bnta.weektwo.thursday.arrays;

// declare a new array which can hold the numbers from 1-10 (inclusive)
// create a `for` loop which initialises this array with the numbers 1-10
// print the array to the console

import java.util.Arrays;

public class ArraysExercise8 {
    public static void main(String[] args) {

        int [] numArray = new int[11];

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = i;
        }

        System.out.println(Arrays.toString(numArray));

    }
}
