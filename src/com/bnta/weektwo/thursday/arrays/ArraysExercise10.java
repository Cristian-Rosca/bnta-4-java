package com.bnta.weektwo.thursday.arrays;

// start from your solution to Q5
// create a String variable called `condition` which has the value "c"
// create a Boolean variable called `hasC` which has the value `false`
// create a `for` loop which goes through each item in our array, comparing it against our `condition` variable
// if the two are equal, change the `hasC` value to `true`
// once the `for` loop concludes, print out a message which tells you if `hasC` is `true` or `false`


public class ArraysExercise10 {
    public static void main(String[] args) {

        String [] words = {"a", "b", "c", "d"};

        String condition = "c";

        Boolean hasC = null;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(condition)) {
                hasC = true;
                break; // Make sure to break the loop after identifying the value you need. Otherwise, it will be overwritten on next iteration.
            }
            else hasC = false;
        }

        System.out.println(hasC);

//        for (int i = 0; i < words.length; i++) {
//            System.out.println(words[i]);
        }

    }

