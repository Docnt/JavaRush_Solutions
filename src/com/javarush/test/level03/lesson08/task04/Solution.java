package com.javarush.test.level03.lesson08.task04;

/* Sponsor! That has a proud sound!
Write a program that reads from keyboard two names and displays the text:
    «name1» sponsored «name2», and she became a famous singer.

    Example:
    Nick sponsored Helen, and she became a famous singer.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        String[] n = new String[2];
        for(int i = 0; i<2; i++) n[i]=scan.nextLine();

        System.out.printf("%s sponsored %s, and she became a famous singer.", n[0], n[1]);

    }
}