package com.bnta.weektwo.wednesday;

// create a sum variable
// using your answer from Question 4, create a for loop that goes through the values
// add each item to the sum value
// print the total sum

public class LoopsExercise6 {
    public static void main(String[] args) {
        int [] arr = new int[11]; // creating a new integer array and manually setting the size of the array

        int sumValue = 10;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            sumValue += arr[i];
        }

        System.out.println(sumValue);

    }
}
