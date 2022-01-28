package com.bnta.weektwo.thursday.conditionals;

// create a String variable and assign it a value
// create a `for` loop which wraps around your answer from Question 7
// modify your `if` statement to check the character at each index
// Hint: use your internal, incrementing value of your `for` loop within the `.charAt()` method
// print something to the console if the condition is met

import java.util.Arrays;

public class ConditionalsExercise8 {
    public static void main(String[] args) {

        String str = "abc";

        String test = "b";

        String [] name = new String[str.length()];

        for (int i = 0; i < name.length; i++) {
            name[i] = String.valueOf(str.charAt(i)); // Need to include this as String.valueOf
        }

        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(test)) {
                System.out.println(test + " character match with character in position " + i);
            }
            else System.out.println("No character match");
        }


//        String firstLetter = str.substring(0,1);
//        String secondLetter = str.substring(1,2);
//        String thirdLetter = str.substring(2,3);




    }
}
