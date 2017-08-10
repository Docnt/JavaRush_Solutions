package com.javarush.test.level04.lesson06.task01;

/* Minimum of two numbers
Write a program that reads two numbers from keyboard and displays to the screen the minimum of these numbers.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        int[] n = new int[2];
        for(int i = 0; i<2; i++) n[i]=scan.nextInt();

        System.out.print(Math.min(n[0], n[1]));

    }
}