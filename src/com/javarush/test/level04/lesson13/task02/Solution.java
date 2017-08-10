package com.javarush.test.level04.lesson13.task02;

import java.io.*;
import java.util.Scanner;

/* Draw a rectangle
Write a program that reads from keyboard two numbers: m and n.
    The program should display to the screen a rectangle composed of eights sized m by n. Use “for” loop.

    Example: m=2, n=4
    8888
    8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();

        for(int x = m; x>0; x--)
        {
            for(int y = n; y>0; y--)System.out.print(8);
            System.out.println();
        }
    }
}
