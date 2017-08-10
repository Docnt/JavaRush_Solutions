package com.javarush.test.level05.lesson09.task05;

/* Create a class Rectangle
Create a class Rectangle. Its data will be top, left, width and height. Create for it as much constructors as possible:
    Examples:
    -	4 parameters are set: left, top, width, height
    -	width/height are not set (both equal 0)
    -	height are not set (equal to width), create a square
    -	create a copy of another rectangle (it’s passed in the parameters)
*/

public class Rectangle
{
    private int width = 0;
    private int height = 0;
    private int left = 0;
    private int top = 0;

    public Rectangle(int width, int height)
    {
        this.height = height;
        this.width = width;
    }

    public Rectangle()
    {
    }

    public Rectangle(int width)
    {
        this.height = width;
        this.width = width;
    }

    public Rectangle(int left, int top, int width, int height)
    {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

}
