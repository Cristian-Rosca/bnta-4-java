package com.bnta.weektwo.thursday.scanners;

// create a File object from a text file
// create a Scanner object from out File object
// create a loop which checks whether there is still some unused input
// create a local variable which is assigned to the next line of the input
// print the line to the console

import java.io.File;
import java.util.Scanner;

public class ScannerExercise3 {
    public static void main(String[] args) throws Exception {

        File myFile = new File("Users/cristianrosca/desktop/input.txt"); // Struggling to figure out why java can't find file can't be accessed

        Scanner fileScanner = new Scanner (myFile);

        while (fileScanner.hasNext()) { // .hasNext examines the input and creates a booLean value. While there is another token it will remain true
            String input = fileScanner.nextLine(); // can also use .hasNextLine which checks for another line
            System.out.println(input);
        }



    }
}
