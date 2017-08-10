package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Learning and practicing algorithm
Task: Write a program that
    1. reads from the console number N > 0
    2. then reads from the console N numbers
    3. displays the maximum of N numbers typed in.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int maximum = Integer.parseInt(reader.readLine());
        for(n = n-1; n>0; n--)
        {
            int x = Integer.parseInt(reader.readLine());
            if(x>maximum) maximum = x;
        }

        System.out.println(maximum);
    }
}
