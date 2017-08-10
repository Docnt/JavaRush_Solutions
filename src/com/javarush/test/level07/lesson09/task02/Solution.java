package com.javarush.test.level07.lesson09.task02;

import java.util.ArrayList;
import java.util.Scanner;

/* 5 words in reverse order
Read from the keyboard 5 words. Add them into a string list and display them to the screen in reverse order.
*/

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
        for (int i = 4; i >= 0; i--)
        {
            System.out.println(array.get(i));
        }
    }
}
