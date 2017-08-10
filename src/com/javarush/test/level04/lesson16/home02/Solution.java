package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.Scanner;

/* Display an average
Write a program that reads from keyboard three numbers.
    The program should display to the screen the average of these numbers, that is, neither the biggest nor the smallest one.
*/

public class Solution
{

    public static void main(String[] args)   throws Exception
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a<b)
        {
            int temp = a;
            a = b;
            b = temp;
        }
        if(b<c)
        {
            int temp = b;
            b = c;
            c = temp;
        }
        if(a<b)
        {
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.print(b);
    }
}
