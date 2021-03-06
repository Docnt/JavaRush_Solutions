package com.javarush.test.level07.lesson04.task04;

import java.util.Scanner;

/* Array of numbers in reverse order
1. Create an array of 10 numbers.
    2. Read from the keyboard 10 numbers and store them in the array.
    3. Arrange array elements in reverse order.
    4. Display to the screen the result. Each value should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = new int[10];

        Scanner scan = new Scanner(System.in);

        for (int i = 9; i >= 0; i--)
        {
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < 10; i++)
        {
            System.out.println(array[i]);
        }

    }
}
