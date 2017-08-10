package com.javarush.test.level07.lesson12.home04;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/* Read strings from the keyboard until user enters the string “end”
Create a list of strings.
    Read from the keyboard strings (whatever you want), add them to the list.
    Read strings from the keyboard until user enters the string “end”. “end” should be omitted.
    Display to the screen the strings. Each string should be on a new line.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> array = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        boolean end = false;
        while (!end)
        {
            String s = scan.nextLine();
            if (s.equals("end")) end = true;
            else array.add(s);
        }
        for (String s : array)
        {
            System.out.println(s);
        }
    }
}
