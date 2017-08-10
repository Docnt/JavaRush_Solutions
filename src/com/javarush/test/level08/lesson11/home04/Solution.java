package com.javarush.test.level08.lesson11.home04;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* The minimum of N numbers
1. Read from the keyboard number N.
    2. Read from the keyboard N integers and fill a list with them using a method getIntegerList().
    3. Find the minimum number among the elements of the list using a method getMinimum().
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int i = array.get(0);
        for (int j : array)
        {
            if (j < i) i = j;
        }
        return i;
    }

    public static List<Integer> getIntegerList() throws IOException {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int n = scan.nextInt();
        while (n > 0)
        {
            int i = scan.nextInt();
            list.add(i);
            n--;
        }
        return list;
    }
}
