package com.javarush.test.level04.lesson06.task05;

/* 18+
Write a program that reads a name and age from keyboard. If the age is less than 18 display «Grow up a little»
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        int a = scan.nextInt();
        if(a<18)System.out.print("Grow up a little");


    }
}
