package com.javarush.test.level07.lesson09.task03;

import java.util.ArrayList;

/* The word «here»
1. Create a list of the words «stop», «look», «listen».
    2. Add a string containing «here» after each word.
    3. Display the result. Each element of list should be on a new line. Use “for” loop.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> array = new ArrayList<String>();
        array.add("stop");
        array.add("look");
        array.add("listen");

        array.set(0, array.get(0) + " here");
        array.set(1, array.get(1) + " here");
        array.set(2, array.get(2) + " here");

        for (int i = 0; i < 3; i++)
        {
            System.out.println(array.get(i));
        }
    }
}
