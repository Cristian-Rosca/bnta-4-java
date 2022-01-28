package com.bnta.weektwo.wednesday;
// Start with the array: ["i", "sure", "do", "love", "bees"]
// create a for loop which goes through each string in our array
// grab the first letter of our word
// capitalise the first letter
// add the capitalised letter to the rest of the provided word
// assign the value to an array
// print our resulting array

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class LoopsExercise8 {

    public static void main(String[] args) {

        String [] strings = {"i", "sure", "do", "love", "bees"};

        String[] capStrings = new String[strings.length]; // If you want to use a variable outside a for loop, declare it outside of the loop

        for (int i = 0; i < strings.length; i++) {
            capStrings[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1);
        }

        System.out.println(Arrays.toString(capStrings));

    }

}
