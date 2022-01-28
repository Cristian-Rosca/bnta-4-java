package com.bnta.weektwo.wednesday;

// create a for loop which goes through each string in our array
// make each word uppercase
// assign the value in the array to the uppercase string
// print our resulting array

import java.util.Arrays;
import java.util.Locale;

public class LoopsExercise7 {
    public static void main(String[] args) {

        String [] words = {"i", "sure", "do", "love", "bees"};

        for (int i = 0; i <= words.length-1; i++) {
            String [] upperWords = new String[words.length];
            upperWords[i] = words[i].toUpperCase(Locale.ROOT);
            System.out.println(upperWords[i]);


        }

        /*

        ALTERNATIVE SOLUTION - Should have used Arrays.toString method to print out the results
        for (int i = 0; i < ourArray.length; i++) {
    ourArray[i] = ourArray[i].toUpperCase();
}

System.out.println(Arrays.toString(ourArray));
         */

    }
}
