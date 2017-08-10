package com.javarush.test.level04.lesson13.task05;

import java.io.*;
import java.util.Scanner;

/* Everybody loves somebody
Write a program that reads from keyboard name. Use “for” loop to display 10 times the text:
    «name» loves me.

    Example text:
    Pam loves me.
    Pam loves me.
    …
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        for(int x = 1; x<=10; x++)System.out.println(a + " loves me.");

    }
}
