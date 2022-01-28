package com.bnta.weektwo.thursday.methods;

import java.util.Scanner;

/*

Write a method which takes an array of strings as an argument and returns the number of items in the array.

 */
public class MethodsExercise6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your first word");
        String word1 = scanner.nextLine();

        System.out.println("Input your second word");
        String word2 = scanner.nextLine();

        System.out.println("Input your third word");
        String word3 = scanner.nextLine();

        String [] strings = new String[3];

        strings[0] = word1;
        strings[1] = word2;
        strings[3] = word2;


//        String [] strings = {"word1", "words2", "words3"};

        System.out.println(arrayCount(strings));

    }

    public static int arrayCount (String [] inputArray) {
        int arrayLength = inputArray.length;
        return arrayLength;
    }

}
