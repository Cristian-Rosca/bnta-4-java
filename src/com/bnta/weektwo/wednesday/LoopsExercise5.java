package com.bnta.weektwo.wednesday;

// using your answer from Question 4, create a for loop that goes through the values
// print each value individually

public class LoopsExercise5 {
    public static void main(String[] args) {

        int [] arr = new int[11]; // creating a new integer array and manually setting the size of the array

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }


    }
}
