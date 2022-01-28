package com.bnta.weektwo.thursday.scanners;

// create a Scanner object - remember to import `java.util.Scanner` at the top of your file!
// create a variable which is assigned to the value passed into the scanner from the terminal
// print this variable

import java.util.Scanner;

public class ScannerExercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type below:");
        String input = scanner.nextLine();

        System.out.println(input);
    }
}
