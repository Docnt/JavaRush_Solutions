package com.javarush.test.level07.lesson06.task01;

/* 5 different strings in a list
1. Create a list of strings.
    2. Add 5 different strings to the list.
    3. Display to the screen its size.
    4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> array = new ArrayList<String>();
        String s = "";
        for (int i = 0; i < 5; i++)
        {
            s = s + "s";
            array.add(s);
        }
        System.out.println(array.size());

        for (int x = 0; x < 5; x++)
        {
            System.out.println(array.get(x));
        }

    }
}
