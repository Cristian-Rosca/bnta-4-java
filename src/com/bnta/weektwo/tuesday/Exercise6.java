package com.bnta.weektwo.tuesday;

import java.util.Scanner;

/*
        Create a package called email
        Then have a method called validateEmail that return true of false if input is valid email
        Finally invoke validateEmail in main
            i.e. "hello@gmail.com" -> true
            i.e. "hellogmail.com" -> false
    */
public class Exercise6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Input your email below");
        String email = scanner.nextLine();

        System.out.println(email.contains("@"));
    }

//    public static boolean validateEmail (String email) {
//        if (email )
//        return true;
    }


