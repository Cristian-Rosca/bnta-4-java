package com.bnta.weektwo.thursday.enums_dates_exceptions;

// write a method that calculate age on any given date

// hint: subtract todays date[year] - date[year]

import java.time.LocalDate;

public class Exercise5 {
    public static void main(String[] args) {



        System.out.println("Age: " + calculateAge(LocalDate.of(1998,04,21)));
    }

    public static int calculateAge (LocalDate inputDate) {
        int age = 0;
        age = LocalDate.now().getYear() - inputDate.getYear();
        return age;
    }

}

