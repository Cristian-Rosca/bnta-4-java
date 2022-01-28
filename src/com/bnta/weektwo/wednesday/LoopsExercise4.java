package com.bnta.weektwo.wednesday;

// create an array. Remember to manually set the size
// create a for loop which goes from 0 to 10, adding each value to an array
// print our array

public class LoopsExercise4 {
    public static void main(String[] args) {

        int [] arr = new int[11]; // creating a new integer array and manually setting the size of the array

        int arraySum = 0;

        for (int i = 0; i <= arr.length; i++) {
            arraySum = arraySum + i;}

        System.out.println(arraySum);

        }

    }

