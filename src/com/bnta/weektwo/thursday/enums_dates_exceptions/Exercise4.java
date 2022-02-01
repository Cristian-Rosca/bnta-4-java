package com.bnta.weektwo.thursday.enums_dates_exceptions;

import java.time.LocalDate;

// 1 - Print todays Date and Time using LocalDate
// 2 - Represent your date of birth using LocalDate
// 3 - Add 100 days to your dob and print it
public class Exercise4 {
    public static void main(String[] args) {

        // 1 - Print todays Date and Time using LocalDate
        LocalDate dateToday = LocalDate.now();
        System.out.println(dateToday);

        // 2 - Represent your date of birth using LocalDate
        LocalDate myBirthday = LocalDate.of(1998,4,21);
        System.out.println(myBirthday);

        // 3 - Add 100 days to your dob and print it
        LocalDate hundredDaysOlder = myBirthday.plusDays(100);
        System.out.println(hundredDaysOlder);

    }
}
