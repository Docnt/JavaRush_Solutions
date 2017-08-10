package com.javarush.test.level07.lesson06.task05;

/* Delete the last string and add it to the beginning of the list
1. Create a list of strings.
    2. Read from keyboard 5 strings. Add these strings to the list.
    3. Delete the last string and add it to the beginning of the list. Repeat this action 13 times.
    4. Display to the screen contents of the list. Each value should be on a new line. Use a loop.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> array = new ArrayList<String>();

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
        {
            array.add(scan.nextLine());
        }

        for (int i = 0; i < 13; i++)
        {
            array.add(0,array.get(array.size() - 1));
            array.remove(array.size() - 1);
        }

        for (int x = 0; x < 5; x++)
        {
            System.out.println(array.get(x));
        }

    }
}
