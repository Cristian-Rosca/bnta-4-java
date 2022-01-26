package com.bnta.weekone.friday;

public class Exercise3 {
    public static void main(String[] args) {
        String[] content = {"you", "are", "how", "hello"};

        String result = "";
        for (int i = content.length - 1; i>=0; i--){
            result += content[i] + " ";
        }

        System.out.println(result.substring(0,result.length()-1) + " " + "?");

    }
}