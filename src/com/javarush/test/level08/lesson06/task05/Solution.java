package com.javarush.test.level08.lesson06.task05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Four methods
Implement 4 methods. The methods should return a list best suited to perform specified operations
(to cope fast with a large number of operations). No measurement needed.
*/

public class Solution
{
    public static List  getListForGet()
    {
        ArrayList list = new ArrayList();
        return list;

    }

    public static List  getListForSet()
    {
        ArrayList list = new ArrayList();
        return list;

    }

    public static List  getListForAddOrInsert()
    {
        LinkedList list = new LinkedList();
        return list;

    }

    public static List  getListForRemove()
    {
        LinkedList list = new LinkedList();
        return list;

    }
}
