package com.javarush.test.level03.lesson08.task02;

/* Salary in 5 years
Write a program that reads from keyboard a name and two numbers. Program should display the text:
    «name» earns «number1» in «number2» years.

    Example:
    Nick earns $150,000 in 5 years.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int[] n = new int[2];
        for(int i = 0; i<2; i++) n[i]=scan.nextInt();

        System.out.printf("%s earns %d in %d years.",name, n[0], n[1]);

    }
}

