package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Working with date
1. Implement the method isDateOdd(String date) so that it returns true, if the number of days from the beginning
 of the year is odd, otherwise it returns false.
    2. String date is passed in the format MAY 1 2013

    JANUARY 1 2000 = true
    JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public static boolean isDateOdd(String date)
    {
        Date dates = new Date(date);
        long finish = dates.getTime();
        dates.setDate(1);
        dates.setMonth(0);
        long start = dates.getTime();
        long dif = finish - start;
        long msDay = 1000 * 60 * 60 * 24;
        int dayCount = (int) (dif / msDay);
        if (dayCount % 2 == 0) return true;
        else return false;
    }
}
