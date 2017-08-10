package com.javarush.test.level04.lesson06.task04;

/* Compare names
Write a program that reads two names from keyboard, and if the names are the same, displays «Names are identical».
    Display «Name lengths are equal» if the names are different, but their lengths are equal.
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

        if(n[0].equals(n[1])) System.out.print("Names are identical");
        else if(n[0].length()==n[1].length())System.out.print("Name lengths are equal");


    }
}
