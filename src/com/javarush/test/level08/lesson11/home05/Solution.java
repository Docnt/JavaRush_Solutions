package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Stop Look Listen. Now capitalized
Write a program that should read from the keyboard a string.
    The program should replace the first letters of all words in the text with the uppercase.
    Display to the screen the result.

    Example input:
    stop look listen
    Example output:
    Stop Look Listen
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String s = reader.readLine();
//
//        String[] n = s.split(" ");
//        int a = 0;
//        for (String i : n)
//        {
//
//            String[] m = i.split("");
//            m[0] = m[0].toUpperCase();
//            i = "";
//            for (String j : m)
//            {
//                i = i + j;
//            }
//            n[a] = i;
//            a++;
//        }
//
//        s = n[0];
//        for (int i = 1; i < n.length; i++)
//        {
//            s = s + " " + n[i];
//        }
//
//        System.out.print(s);
//
//    }

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String input = buff.readLine(); //read input

        char[] arrayChar = input.toCharArray(); //convert string into char

        String[] temp = new String[arrayChar.length]; //make string array and add each charackter to it
        for (int i = 0; i < arrayChar.length; i++)
        {
            temp[i] = String.valueOf(arrayChar[i]);
        }

        temp = firstUp(temp); //use method wrote below - we need it

        String result = ""; //make string which will be printed
        for (int i = 0; i < temp.length; i++)
        {
            result = result.concat(temp[i]); //we use concat method to add string to end of another string
        }
        System.out.println(result);

    }

    public static String[] firstUp(String[] arx)
    {
        arx[0] = arx[0].toUpperCase();
        for (int i = 0; i < arx.length; i++)
        {
            if (arx[i].equals(" ") && !arx[i + 1].equals(" ")) //looking for whitespace and a letter just after it
                arx[i + 1] = arx[i + 1].toUpperCase(); //when found convert to uppercase
        }

        return arx;
    }


}
