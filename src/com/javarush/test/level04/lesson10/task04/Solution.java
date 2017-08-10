package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-square
Write a program that displays to the screen a square 10x10 of “S” characters. Use “while” loop.
    Don’t separate characters in the same line.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       int x = 1;
       while(x<=10)
       {
           int y = 1;
           while(y<=10)
           {
               System.out.print("S");
               y++;
           }
           System.out.println();
           x++;
       }

    }
}
