package com.bnta.weektwo.tuesday;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
        Write a method that displays random joke to the user.
        Your program should stop displaying jokes when use inputs no.
        For e.g
        Want to hear a joke? Yes/No
            if yes then display joke and repeat same question
            if no then program should exit


        1) Create an if statement that asks if 'Want to hear a joke'
        2) Have the answer variable be an input from the user
        3) Create a String Array of strings containing jokes
        4) If the answer variable is yes, run the for loop that will randomly choose a joke to print
    */
public class Exercise5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in); // invokes a new scanner variable

//        BELOW NOT USED - MY ATTEMPT OF CREATING IF STATEMENT INSTEAD OF WHILE LOOP
//        if (answer.equals("yes")) {
//            generateJoke();
//        }
//        else if (answer.equals("no")) {
//            System.out.println("Ok, no jokes");
//        } else
//            System.out.println("Invalid input, try again");

        boolean keepAsking = true; // creates a booLean for the while loop

        while (keepAsking) {     // while the booLean keepAsking is true, the loop will keep running
            System.out.println("Do you want to hear a joke? Yes/No");
            String rawInput = scanner.nextLine(); // Takes input from the user and uses it to populate the String rawInput
            String input = rawInput.toLowerCase(); // Makes the actual input string non-case sensitive
            if (input.equals("yes")) {
                generateJoke(); // if the answer is yes, invoke the function from below
            } else if (input.equals("no")) {
                System.out.println("Ok, no more jokes");
                keepAsking = false;    // changes the boolean value to false
            } else {
                System.out.println("Input not recognised"); // Notes invalid inputs and restarts the loop to ask the question again
            }
        }
    }



// Joke Generator Method
    private static void generateJoke() { //creating a method called generateJoke
        String [] jokes = {             // creating an array of string to hold all of the jokes
                    "Joke 1",
                    "Joke 2",
                    "Joke 3",
                    "Joke 4",
                    "Joke 5"};
        Random rand = new Random();     // calling the random function from java.util.Random
        int randomNum = rand.nextInt(jokes.length); //generating a random variable between 0 to length of array a
        System.out.println(jokes[randomNum]); // printing the array element to match the random number generated
    }

}
