package com.javarush.test.level04.lesson10.task03;

import java.io.*;
import java.util.Scanner;

/* You can never have too much of a good thing
Write a program that reads from keyboard a string and number N.
    Program should display to the screen the string N times. Use “while” loop.
    Example input:
    abc
    2
    Example output:
    abc
    abc
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        int i = scan.nextInt();
        while(i>0)
        {
            System.out.println(string);
            i--;
        }

    }
}
