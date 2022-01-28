package com.bnta.weektwo.thursday.methods;

/*
Write a method which takes a string as an argument, capitalises the first letter and returns the capitalised string.
 */

import java.util.Locale;
import java.util.Scanner;

public class MethodsExercise5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Input your word to be capitalised");
        String userInput = scanner.nextLine();

        System.out.println(capitalise(userInput));

    }

    public static String capitalise (String str) {
        String capStr = "";
        capStr = str.substring(0,1).toUpperCase(Locale.ROOT) + str.substring(1).toLowerCase();
        return capStr;
    }
}
