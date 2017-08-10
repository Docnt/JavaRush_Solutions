package com.javarush.test.level05.lesson12.home05;

/* Read numbers from keyboard and calculate their total
Read numbers from keyboard and calculate their total until the user enters the word «total». Display to the screen the total.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n = reader.readLine();

        int sum = 0;
        while (!n.equals("сумма"))
        {
            sum = Integer.parseInt(n) + sum;
            n = reader.readLine();
        }

        System.out.print(sum);
    }

}
