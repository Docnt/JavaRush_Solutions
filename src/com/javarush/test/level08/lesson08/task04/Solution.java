package com.javarush.test.level08.lesson08.task04;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Remove all the people born in the summer
Create a dictionary (Map<String, Date>) and add ten entries according to the model «last mane» - «birth date».
    Remove from the map all the people born in the summer.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stsallone", new Date("JULY 1 1980"));
        map.put("Stadllone", new Date("AUGUST 1 1980"));
        map.put("Stalflone", new Date("JUNE 1 1980"));
        map.put("Stallgone", new Date("JUNE 1 1980"));
        map.put("Stallohne", new Date("JUNE 1 1980"));
        map.put("Stallonje", new Date("JUNE 1 1980"));
        map.put("Stqallone", new Date("JUNE 1 1980"));
        map.put("Stawllone", new Date("JUNE 1 1980"));
        map.put("Stalelone", new Date("JUNE 1 1980"));


        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        SimpleDateFormat date = new SimpleDateFormat("MM");
        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry<String, Date> element = it.next();
            if (Integer.parseInt(date.format(element.getValue().getTime())) > 5 && Integer.parseInt(date.format(element.getValue().getTime())) < 9)
            {
                it.remove();
            }
        }
    }
}
