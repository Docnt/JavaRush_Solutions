package com.javarush.test.level08.lesson11.bonus01;

import java.io.IOException;
import java.util.Scanner;

/* Month number
The program should read from the keyboard the name of the month and display to the screen its number in following way: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        System.out.print(s + " is ");

        if (s.equals("January"))
        {
            System.out.print(1);

        } else if (s.equals("February"))
        {
            System.out.print(2);

        } else if (s.equals("March"))
        {
            System.out.print(3);

        } else if (s.equals("April"))
        {
            System.out.print(4);

        } else if (s.equals("May"))
        {
            System.out.print(5);

        } else if (s.equals("June"))
        {
            System.out.print(6);

        } else if (s.equals("July"))
        {
            System.out.print(7);

        } else if (s.equals("August"))
        {
            System.out.print(8);

        } else if (s.equals("September"))
        {
            System.out.print(9);

        } else if (s.equals("October"))
        {
            System.out.print(10);

        } else if (s.equals("November"))
        {
            System.out.print(11);

        } else if (s.equals("December"))
        {
            System.out.print(12);

        }
        System.out.println(" month");
    }

}
