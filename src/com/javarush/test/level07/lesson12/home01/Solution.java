package com.javarush.test.level07.lesson12.home01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Display numbers in reverse order
Read from the keyboard 10 numbers and fill the list with them.
    Display to the screen the numbers in reverse order. Use the loop.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
        {
            array.add(scan.nextInt());
        }
        for (int i = 9; i >= 0; i--)
        {
            System.out.println(array.get(i));
        }
    }
}
