package com.javarush.test.level04.lesson16.home03;

import java.io.*;
import java.util.Scanner;

/* Calculate a sum
Write a program that reads from keyboard numbers and calculates their sum.
    If the user enters -1, the program should display the sum and terminate. -1 should be included in sum.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int a = 0;
        while(a!=-1)
        {
            a = scan.nextInt();
            sum = sum+a;
        }
        System.out.print(sum);
    }
}
