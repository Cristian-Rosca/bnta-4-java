package com.bnta.weektwo.thursday.arrays;

// adding onto your example from Q9, now create a second `for` loop which reassigns each value in the array to be double the initial value
// again print the array

import java.util.Arrays;

public class ArraysExercise9 {
    public static void main(String[] args) {

        int [] numArray = new int[11];

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = i;
        }

        int [] doubleArray = new int[numArray.length];

        doubleArray = Arrays.copyOf(numArray,numArray.length);

        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = doubleArray[i] * 2;
        }

        System.out.println(Arrays.toString(numArray));

        System.out.println(Arrays.toString(doubleArray));
    }
}
