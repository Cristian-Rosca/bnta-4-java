package com.bnta.weektwo.thursday.conditionals;

// create three `int` variables. Assign them values with the first value sitting between the other two
// create an `if` statement which compares whether the first value is greater than the second AND less than the third
// print something to the console if the condition is met
// create an `else` statement which prints to the console if the above condition is NOT met

public class ConditionalsExercise5 {
    public static void main(String[] args) {

        int a = 2;
        int b = 1;
        int c = 3;

        if (a>b && a<c) {
            System.out.println("a is greater than b, but less than c");
        }
        else System.out.println("Conditions not met");

    }
}
