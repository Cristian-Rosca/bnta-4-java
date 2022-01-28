package com.bnta.weektwo.thursday.conditionals;

// create two `int` variables. Assign them values
// create an `if` statement which compares whether one value is greater than the other
// print something to the console if the condition is met
// create an `else` statement which prints to the console if the above condition is NOT met

public class ConditionalsExercise4 {
    public static void main(String[] args) {

        int int1 = 1;
        int int2 = 2;

        if (int1>int2) {
            System.out.println("int 1 > int 2");
        }
        else if (int1<int2) {
            System.out.println("int 2 > int 1");
        }
        else System.out.println("int 1 and int 2 are equal");

    }
}
