package com.javarush.test.level07.lesson09.task01;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Three arrays
1. Read from the keyboard 20 numbers, save them in a list, then sort them into three other lists:
    List 1 stores numbers divisible by 3 (x%3==0)
    List 2 stores numbers divisible by 2 (x%2==0)
    List 3 stores the rest of numbers.
    The numbers divisible by 3 and 2 at the same time (for example 6) belong to both lists – list 1 and list 2.
    2. The method printList() should display each element of the list on a new line.
    3. Use the method printList() to display to the screen these three lists. First the list 1 should be displayed, then list 2, after that list 3.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        ArrayList<Integer> array3 = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 20; i++)
        {
            array.add(scan.nextInt());
            if (array.get(i) % 3 == 0) array1.add(array.get(i));
            if (array.get(i) % 2 == 0) array2.add(array.get(i));
            if (array.get(i) % 3 != 0 && array.get(i) % 2 != 0) array3.add(array.get(i));
        }
        printList(array1);
        printList(array2);
        printList(array3);

    }

    public static void printList(List<Integer> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
