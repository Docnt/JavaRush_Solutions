package com.javarush.test.level09.lesson02.task02;

/* StackTrace again
Write five methods that call each other. Each method should return the name of its caller method.
    You can obtain caller method using StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static String method1()
    {
        method2();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        String s = stack[2].getMethodName();
        return s;

    }

    public static String method2()
    {
        method3();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        String s = stack[2].getMethodName();
        return s;

    }

    public static String method3()
    {
        method4();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        String s = stack[2].getMethodName();
        return s;

    }

    public static String method4()
    {
        method5();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        String s = stack[2].getMethodName();
        return s;

    }

    public static String method5()
    {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        String s = stack[2].getMethodName();
        return s;
    }
}
