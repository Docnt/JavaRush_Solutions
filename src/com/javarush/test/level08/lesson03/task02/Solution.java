package com.javarush.test.level08.lesson03.task02;

/* HashMap of 10 pairs
Create a collection HashMap<String, String>, place 10 pairs of strings into the collection:
    watermelon - berry, banana - grass, cherry - berry, pear - fruit, melon - vegetable, blackberry - berry,
    ginseng - root, strawberry - berry, iris - flower, potato - tuber.
    Display to the screen the contents of the collection. Each entry should be on a new line.

    Output example (only one string is shown):
    potato - tuber
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, String> mapa = new HashMap<String, String>();

        mapa.put("watermelon", "berry");
        mapa.put("banana", "grass");
        mapa.put("cherry", "berry");
        mapa.put("pear", "fruit");
        mapa.put("melon", "vegetable");
        mapa.put("blackberry", "berry");
        mapa.put("ginseng", "root");
        mapa.put("strawberry", "berry");
        mapa.put("iris", "flower");
        mapa.put("potato", "tuber");

        for(Map.Entry<String, String> owoc : mapa.entrySet())
        {
            System.out.println(owoc.getKey() + " - " + owoc.getValue());
        }

    }
}
