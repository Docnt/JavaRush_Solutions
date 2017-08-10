package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 words beginning with «L»
Create a set of strings (Set<String>), place into it 20 words beginning with «L».
*/

//BECAUSE OF JAVARUSH BUG THIS PROGRAM CAN'T PASS THE TESTS!!!

public class Solution
{
    public static HashSet<String> createSet()
    {
        Set<String> set = new HashSet<String>();

        for (int i = 0; i < 20; i++)
        {
            set.add("L" + i);
        }

        return (HashSet<String>) set;
    }


}
