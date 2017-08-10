package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Class ConsoleReader
Write a class ConsoleReader, which will have 4 static methods:
    - String readString() to read strings from keyboard
    - int readInt() to read numbers from keyboard
    - double readDouble() to read fractional numbers from keyboard
    - void readLn() to wait for pressing enter [use readString()]
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

        return string;

    }

    public static int readInt() throws Exception
    {
        Scanner scan = new Scanner(System.in);
        int string = scan.nextInt();

        return string;

    }

    public static double readDouble() throws Exception
    {
        Scanner scan = new Scanner(System.in);
        double string = scan.nextDouble();

        return string;

    }

    public static void readLn() throws Exception
    {
        String str=readString();

    }
}
