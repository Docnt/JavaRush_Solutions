package com.javarush.test.level09.lesson02.task03;

/* The method should return the line number of the code this method was called from
Write five methods that call each other. Each method should return the line number of the code this method was called from.
    Use the function element.getLineNumber().
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static int method1()
    {
        method2();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return stack[2].getLineNumber();
    }

    public static int method2()
    {
        method3();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return stack[2].getLineNumber();
    }

    public static int method3()
    {
        method4();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return stack[2].getLineNumber();
    }

    public static int method4()
    {
        method5();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return stack[2].getLineNumber();
    }

    public static int method5()
    {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return stack[2].getLineNumber();
    }
}
