package com.javarush.test.level04.lesson06.task02;

/* Maximum of four numbers
Write a program that reads four numbers from keyboard and displays to the screen the maximum of these numbers.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        int a;
        a = scan.nextInt();
        for (int i = 0; i < 3; i++)
        {
            int temp = scan.nextInt();
            if (temp > a) a = temp;
        }

        System.out.print(a);

    }
}
