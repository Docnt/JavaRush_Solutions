package com.javarush.test.level07.lesson12.home03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/* Largest and smallest number in an array
Create an array of 20 numbers.
    Fill it with numbers that are read from keyboard.
    Find the largest and smallest number in an array.
    Display to the screen the largest and smallest numbers separated by a space.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);

        int maximum;
        int minimum;

        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++)
        {
            array.add(scan.nextInt());
        }

        minimum = array.get(0);
        maximum = minimum;

        for (int i = 0; i < array.size(); i += 2)
        {
            int tmin, tmax;
            if (array.get(i) < array.get(i + 1))
            {
                tmin = array.get(i);
                tmax = array.get(i + 1);
            } else
            {
                tmin = array.get(i + 1);
                tmax = array.get(i);
            }

            if (tmin < minimum) minimum = tmin;
            if (tmax > maximum) maximum = tmax;
        }


        System.out.println(maximum);
        System.out.println(minimum);
    }
}
