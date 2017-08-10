package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Remove people having the same first name
Create a dictionary (Map<String, String>) and add ten entries according to the model «last name» - «first name».
    Remove people that have the same first name.
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {

        HashMap<String,String> copy = new HashMap<String, String>(map);

        for (Map.Entry<String, String> pair: copy.entrySet()) {

            for (Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator(); iter.hasNext(); ) {
                Map.Entry<String, String> temp = iter.next();
                if (pair.getValue().equals(temp.getValue())&&!pair.getKey().equals(temp.getKey())) iter.remove();
            }
        }

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
