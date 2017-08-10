package com.javarush.test.level04.lesson06.task03;

/* Sort three numbers
Write a program that reads three numbers from keyboard and displays them in descending order.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        int[] n = new int[3];
        for(int i = 0; i<3; i++) n[i]=scan.nextInt();
        if(n[0]<n[1])
        {
            int temp = n[0];
            n[0]=n[1];
            n[1]=temp;
        }
        if(n[1]<n[2])
        {
            int temp = n[1];
            n[1]=n[2];
            n[2]=temp;
        }
        if(n[0]<n[1])
        {
            int temp = n[0];
            n[0]=n[1];
            n[1]=temp;
        }

        System.out.print(n[0] + " " + n[1] + " " + n[2]);

    }
}
