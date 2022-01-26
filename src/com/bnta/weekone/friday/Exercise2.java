package com.bnta.weekone.friday;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner firstVar = new Scanner(System.in);
        System.out.println("Enter variable name");

        String var1 = firstVar.nextLine();
        String var2 = "testing";
        boolean sameString = var1==var2;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println("Two two strings are identical (true/false)");
        System.out.println(sameString);
    }
}
