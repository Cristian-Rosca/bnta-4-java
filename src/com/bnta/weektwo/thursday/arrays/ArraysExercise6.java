package com.bnta.weektwo.thursday.arrays;

// using your answer to Q5, create a second array which is initialised using your original array
// hint: instead of using the `new` keyword, try simply giving the name of your original array
// change the value at index 0 of the new array to "z"
// print both of your arrays and compare


import java.util.Arrays;

public class ArraysExercise6 {
    public static void main(String[] args) {

        String [] words = {"a", "b", "c", "d"};

        String [] words2 = new String[words.length];

//        Populating second array using for loops
//        for (int i = 0; i < words2.length; i++) {
//            words2[i] = words[i];
//        }


//        Populating seconf array using Arrays.copyOf
        words2 = Arrays.copyOf(words, words.length);

        words2[0] = "z";

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        System.out.println("----------");

        for (int i = 0; i < words2.length; i++) {
            System.out.println(words2[i]);
        }

    }
}
