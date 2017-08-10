package com.javarush.test.level07.lesson09.task05;

import java.util.ArrayList;
import java.util.Scanner;

/* Duplicate the words
1. Read from the keyboard 10 words/strings, add them into a string list.
    2. The method doubleValues should duplicate words according to the pattern a,b,c -> a,a,b,b,c,c.
    3. Display the result. Each element of list should be on a new line. Use “for” loop.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> array = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
        {
            array.add(scan.nextLine());
        }

        ArrayList<String> result = doubleValues(array);

        for (String s : result)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        ArrayList<String> res = new ArrayList<String>();
        for (String s : list)
        {
            res.add(s);
            res.add(s);
        }
        return res;
    }
}
