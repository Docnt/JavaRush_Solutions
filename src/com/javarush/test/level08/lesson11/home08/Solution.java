package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Five largest numbers
Create an array of 20 numbers. Fill it with numbers that are read from keyboard. Display to the screen five largest numbers.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array)
    {
        for (int i = 0; i < 5; i++)
        {
            int mem = i;
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[j] > array[mem])
                {
                    mem = j;
                }
            }
            int temp = array[i];
            array[i] = array[mem];
            array[mem] = temp;
        }
    }
}
