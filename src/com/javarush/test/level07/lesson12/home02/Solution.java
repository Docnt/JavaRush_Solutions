package com.javarush.test.level07.lesson12.home02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/* Move first M lines to the end of the list
Read from the keyboard 2 numbers: N and M.
    Read from keyboard N strings and fill a list with them.
    Move first M lines to the end of the list
    Display to the screen the list. Each value should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        ArrayList<String> array = new ArrayList<String>();

        while (n >= 0)
        {
            array.add(scan.nextLine());
            n--;
        }
        scan.close();

        array.remove(0);
        while (m > 0)
        {
            array.add(array.get(0));
            array.remove(0);
            m--;
        }

        for (int i = 0; i<array.size(); i++)
        {
            System.out.println(array.get(i));
        }

    }
}
