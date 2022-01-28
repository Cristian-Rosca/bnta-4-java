package com.bnta.weektwo.thursday.arrays;

// using your array from Q1, print the contents to the console

import java.util.Arrays;

public class ArraysExercise2 {
    public static void main(String[] args) {

        int [] sampleArray = new int [3];

        for (int i = 0; i < sampleArray.length; i++) {
            System.out.println(sampleArray[i]);
        }

        System.out.println(Arrays.toString(sampleArray));



    }
}
