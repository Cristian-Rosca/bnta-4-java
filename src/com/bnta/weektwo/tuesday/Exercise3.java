package com.bnta.weektwo.tuesday;
/*
      Write a program that receives numbers as program arguments and prints to console if numbers are even or odd
      You might compile and run the program via command line or by editing configuration and pass program arguments
    */

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Define a sample input
        System.out.println("Input an integer below:");
        int input = scanner.nextInt();

        // write an if statement that examines if the number is even or odd

        if (input % 2 == 0){
            System.out.println(input + "---->" + "Even Number");
        }
        else if (input % 2 != 1){
            System.out.println(input + "---->" + "Odd Number");
        }
        else System.out.println("Invalid Entry");
    }
}
