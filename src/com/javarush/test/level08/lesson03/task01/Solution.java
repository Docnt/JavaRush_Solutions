package com.javarush.test.level08.lesson03.task01;

/* A plant HashSet
Create a HashSet collection of String type elements.
    Add to the collection 10 strings: watermelon, banana, cherry, pear, melon, blackberry, ginseng, strawberry, iris, and potato.
    Display to the screen the contents of the collection. Each entry should be on a new line.
    Watch how changed the order of added elements.
*/

import java.util.HashSet;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashSet<String> mapa = new HashSet<String>();

        mapa.add("watermelon");
        mapa.add("banana");
        mapa.add("cherry");
        mapa.add("pear");
        mapa.add("melon");
        mapa.add("blackberry");
        mapa.add("ginseng");
        mapa.add("strawberry");
        mapa.add("iris");
        mapa.add("potato");

        for(String owoc: mapa)
        {
            System.out.println(owoc);
        }


    }
}
