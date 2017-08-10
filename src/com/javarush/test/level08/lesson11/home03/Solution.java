package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* People with the same first names and/or last names
1. Create a dictionary (<String, String>) and add 10 persons according to the model «last name» - «first name».
    2. Among these 10 persons, let there be people with the same first names.
    3. Among these 10 persons, let there be people with the same last names.
    4. Display to the screen contents of the Map.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("f1", "n1");
        map.put("f1", "n2");
        map.put("f2", "n3");
        map.put("f2", "n4");
        map.put("f3", "n5");
        map.put("f4", "n6");
        map.put("f5", "n6");
        map.put("f6", "n7");
        map.put("f7", "n7");
        map.put("f8", "n8");

        return map;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
