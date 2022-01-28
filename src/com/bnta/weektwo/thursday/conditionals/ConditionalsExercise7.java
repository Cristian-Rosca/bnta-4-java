package com.bnta.weektwo.thursday.conditionals;

// create a String variable and assign it a value
// create an `if` statement which grabs the first letter of your word and compares it against a Character value
// print something to the console if the condition is met

public class ConditionalsExercise7 {
    public static void main(String[] args) {

        String str = "abc";

        String a = "a";

        String firstLetter = str.substring(0,1);

        if (firstLetter.equals(a)) {
            System.out.println("condition met");
        }
        else System.out.println("condition not met");

    }
}
