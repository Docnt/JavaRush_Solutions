package com.javarush.test.level07.lesson04.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Maximum of an array of 20 numbers
1. In the method initializeArray():
    1.1. Create an array of 20 numbers
    1.2. Read from the keyboard 20 numbers and fill the array with them
    2. The method max(int[] array) should find the maximum number of the elements of the array
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] lista = new int[20];

        for (int i = 0; i < 20; i++)
        {
            lista[i] = Integer.parseInt(reader.readLine());
        }
        return lista;
    }

    public static int max(int[] array) {
        int x = array.length;
        while(x>1)
        {
            for(int i = 0; i<x-1; i++)
            {
                if(array[i+1]<array[i])
                {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            x--;
        }
        return array[array.length-1];
    }
}
