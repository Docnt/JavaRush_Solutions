package com.javarush.test.level03.lesson12.home03;

/* I will earn $50 per hour
Write a program that reads from keyboard a number n and displays «I will earn $n per hour».

    Example:
    I will earn $50 per hour
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        System.out.printf("I will earn $%d per hour", n);
    }
}