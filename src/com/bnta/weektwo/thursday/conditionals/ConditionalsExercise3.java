package com.bnta.weektwo.thursday.conditionals;

// create an string variable using the `new` keyword
// create a second string variable which has the same value as the first, again using the `new` keyword
// create an `if` statement which compares the two variables and prints to the console if they are equal

public class ConditionalsExercise3 {
    public static void main(String[] args) {

        String str1 = new String();

        String str2 = new String(str1);

        System.out.println(str1);
        System.out.println(str2);

        if (str1.equals(str2)) {
            System.out.println("The words are equal");
        }
        else System.out.println("The words are not equal");

    }
}
