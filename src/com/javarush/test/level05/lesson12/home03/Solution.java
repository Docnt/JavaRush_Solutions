package com.javarush.test.level05.lesson12.home03;

/* Create public static classes Dog and Cat
Add three fields to each class at your option.
    Create objects for the Tom and Jerry cartoon characters, as much as you remember.
    Example:
    Mouse jerryMouse = new Mouse(“Jerry”, 12 (height, cm), 5 (tail length, cm))
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);

        Cat tomCat = new Cat("Tom", 120, 30);
        Dog dog = new Dog("Dog", 150, 0);
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat
    {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog
    {
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}
