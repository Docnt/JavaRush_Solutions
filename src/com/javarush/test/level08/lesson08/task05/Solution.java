package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Remove people having the same first name
Create a dictionary (Map<String, String>) and add ten entries according to the model «last name» - «first name».
    Remove people that have the same first name.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //add your code here

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //add your code here

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
