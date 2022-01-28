package com.bnta.weektwo.thursday.arrays;

// adding onto your code from questions 1-3, reassign the second value in the array to the number `17`
// print the array to the console

import java.util.Arrays;

public class ArraysExercise4 {
    public static void main(String[] args) {

        int [] sampleArray = new int [3];

        Arrays.fill(sampleArray,4);

        sampleArray[1] = 17;

        for (int i = 0; i < sampleArray.length; i++) {
            System.out.println(sampleArray[i]);
        }

    }
}
