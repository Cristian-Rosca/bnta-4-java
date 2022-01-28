package com.bnta.weektwo.thursday.arrays;

// using your array from Q1, fill it with the number `4`
// print the array to the console

import java.util.Arrays;

public class ArraysExercise3 {
    public static void main(String[] args) {

        int [] sampleArray = new int [3];

        Arrays.fill(sampleArray,4);

        for (int i = 0; i < sampleArray.length; i++) {
            System.out.println(sampleArray[i]);
        }

    }
}
