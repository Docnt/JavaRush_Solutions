package com.javarush.test.level04.lesson06.task06;

/* 18 is enough
Write a program that reads a name and age from keyboard.
    If the age is more than 20 display «18 is enough»
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
        if(a>20)System.out.print("18 is enough");

    }
}
