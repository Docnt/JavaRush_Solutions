package com.javarush.test.level07.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Add new functionality to the program.
Old task: The program reads strings until the user enters a blank line by pressing enter. Then it converts lower-case
 into upper-case (Mom turns into MOM) and displays them on the screen.
    New task: The program should read strings until the user enters a blank line by pressing enter.
    The program then builds a new list. If the string has an even number of characters, the string is duplicated,
    if odd number, the string is tripled.

    Example input:
    Cat
    Cats
    Me
    Example output:
    Cat Cat Cat
    Cats Cats
    Me Me
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++)
        {
            String s = list.get(i);
            if (s.length() % 2 == 0)
            {
                for (int j = 0; j < 2; j++)
                {
                    listUpperCase.add(s);
                    System.out.print(s + " ");
                }
            } else
            {
                for (int j = 0; j < 3; j++)
                {
                    listUpperCase.add(s);
                    System.out.print(s + " ");
                }
            }
            System.out.println();

        }
    }
}
