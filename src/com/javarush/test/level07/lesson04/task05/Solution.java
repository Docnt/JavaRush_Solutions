package com.javarush.test.level07.lesson04.task05;

import java.util.Scanner;

/* One large and two small arrays
1. Create an array of 20 numbers.
    2. Read from keyboard 20 numbers and fill the array with them.
    3. Create two arrays of 10 numbers each.
    4. Copy numbers of the large array to two small arrays: the half of the numbers to the first array, the other half to the second one.
    5. Display to the screen the second small array. Each value should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = new int[20];
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++)
        {
            array[i] = scan.nextInt();
            array1[i] = array[i];
        }

        for (int i = 0; i < 10; i++)
        {
            array[i + 10] = scan.nextInt();
            array2[i] = array[i + 10];
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.println(array2[i]);
        }

    }
}
