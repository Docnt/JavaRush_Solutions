package com.javarush.test.level03.lesson08.task03;

/* Modesty adorns a man
Write a program that reads from keyboard a name and displays the text:
    «name» earns $15,000 per month. Haw-haw!

    Example:
    Tim earns $15,000 per month. Haw-haw!
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.printf("%s earns $15,000 per month. Haw-haw!",name);

    }
}