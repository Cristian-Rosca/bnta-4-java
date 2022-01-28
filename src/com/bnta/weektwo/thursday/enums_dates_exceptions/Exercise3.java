package com.bnta.weektwo.thursday.enums_dates_exceptions;

// invoke .values() method on ThirstSize enum and loop through its values and while looping lowercase each value
// hint: while you loop through enums invoke .name() to convert enum to string. without it, you can't lowercase

import java.util.Arrays;
import java.util.Locale;

public class Exercise3 {
    public static void main(String[] args) {

        TshirtSizes.TshirtSize array [] = TshirtSizes.TshirtSize.values(); // The class type is the name of the Enum

        System.out.println(Arrays.toString(array).toLowerCase(Locale.ROOT));
    }
}
