package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Map;

/* Identical first and last names
Create a dictionary (Map<String, String>) and add ten entries according to the model «last name» - «first name».
    Check how many people have the same first or last name as the name specified.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 10; i++)
            map.put("L" + i, "M" + i);
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int i = 0;
        for (Map.Entry<String, String> mapa : map.entrySet())
        {
            if (name.equals(mapa.getValue())) i++;
        }
        return i;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int i = 0;
        for (Map.Entry<String, String> mapa : map.entrySet())
        {
            if (familiya.equals(mapa.getKey())) i++;
        }
        return i;

    }

    public static void main(String[] args)
    {
        HashMap<String, String> nazwiska = createMap();
        System.out.println(getCountTheSameFirstName(nazwiska, "M2"));
        System.out.println(getCountTheSameLastName(nazwiska, "L2"));
    }
}
