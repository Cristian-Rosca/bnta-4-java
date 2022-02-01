package com.bnta.weektwo.thursday.enums_dates_exceptions;

// create a method that sums days of the month for a given array of LocalDate

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Exercise7 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2010, 1, 19);
        int days = date.lengthOfMonth(); // .lengthOfMonth gives the number of days in the month

        System.out.println(sumDays(days));

    }

    public static int sumDays (int days) {
        int daySum = 0;
        for (int i = 0; i < days-1; i++) {
            daySum = daySum + i;
        }
        return daySum;
    }

}
