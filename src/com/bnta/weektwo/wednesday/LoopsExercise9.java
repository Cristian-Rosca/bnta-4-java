package com.bnta.weektwo.wednesday;

// Start with the array of numbers: [1, 6, 17, 9, 20, 5]
// create a for loop which goes through number in our array
// check whether the value is greater than the current greatest value
// reassign the current greatest value if true
// print the greatest value

public class LoopsExercise9 {
    public static void main(String[] args) {

        int [] numbers = {1, 6, 17, 9, 20, 5};
        int greatestNum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > greatestNum) {
                greatestNum = numbers[i];
            }

        }

        System.out.println(greatestNum); /* Make sure to keep note of the order of things in Java.

        This line was intially on ln14 and the code did not run as intended

        */
    }
}
