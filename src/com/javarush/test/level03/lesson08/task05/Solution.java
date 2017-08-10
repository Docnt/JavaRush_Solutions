package com.javarush.test.level03.lesson08.task05;

/* Pure love
Write a program that reads from keyboard three names and displays the text:
    «name1» + «name2» + «name3» = Pure love, oh, yeah! Right!

    Example:
    Joe + Eva + Angelica = Pure love, oh, yeah! Right!
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        String[] n = new String[3];
        for(int i = 0; i<3; i++) n[i]=scan.nextLine();

        System.out.printf("%s + %s + %s = Pure love, oh, yeah! Right!", n[0], n[1], n[2]);

    }
}