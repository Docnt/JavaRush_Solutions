package com.javarush.test.level04.lesson13.task03;

import java.io.*;

/* Draw a triangle
Write a program that displays a right triangle composed of eights with sides 10 and 10. Use “for” loop.

    Example:
    8
    88
    888
    ...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        for(int x = 1; x<=10; x++)
        {
            for(int y = 1; y<=x; y++)System.out.print(8);
            System.out.println();
        }

    }
}
