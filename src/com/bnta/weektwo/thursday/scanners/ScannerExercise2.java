package com.bnta.weektwo.thursday.scanners;

// create a Scanner object - remember to import `java.util.Scanner` at the top of your file!
// create a variable which is assigned to the value passed into the scanner from the terminal
// make the input string uppercase
// print this variable

import java.util.Locale;
import java.util.Scanner;

public class ScannerExercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type below:");
        String input = scanner.nextLine();

        System.out.println(input.toUpperCase());
    }
}
