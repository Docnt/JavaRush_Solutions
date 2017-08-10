package com.javarush.test.level05.lesson09.task04;

/* Create a class Circle
Create a class Circle with three constructors:
    - centerX, centerY, radius
    - centerX, centerY, radius, width
    - centerX, centerY, radius, width, color
*/

public class Circle
{
    int centerX, centerY, radius, width;
    String color;

    public Circle(int x, int y, int r)
    {
        centerX = x;
        centerY = y;
        radius = r;
    }

    public Circle(int x, int y, int r, int w)
    {
        centerX = x;
        centerY = y;
        radius = r;
        width = w;
    }

    public Circle(int x, int y, int r, int w, String c)
    {
        centerX = x;
        centerY = y;
        radius = r;
        width = w;
        color = c;
    }

}
