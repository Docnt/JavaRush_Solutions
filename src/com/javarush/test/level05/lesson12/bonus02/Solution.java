package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Add new functionality to the program
Old Task: add a new function that reads from keyboard two numbers and displays their minimum.
    New task: add a new function that reads from keyboard five numbers and displays their minimum.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b);
        minimum = min(minimum, c);
        minimum = min(minimum, d);
        minimum = min(minimum, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b)
    {
        return a < b ? a : b;
    }

}
