package com.javarush.test.level04.lesson16.home04;

import java.io.*;
import java.util.Scanner;

/* My name's ‘Joe’...
Write a program that reads from keyboard a string «name» and a date of birth (three numbers): y, m, d.
    The program should display to the screen:
    «My name's «name»
    I was born on d.m.y»

    Example:
    «My name's Joe
    I was born on 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int y = scan.nextInt();
        int m = scan.nextInt();
        int d = scan.nextInt();

        System.out.printf("My name's %s\nI was born on %d.%d.%d", name, d, m, y);
    }
}
