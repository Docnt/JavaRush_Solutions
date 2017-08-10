package com.javarush.test.level05.lesson12.home02;

/* A Man and A Woman
1. Create public static classes Man and Woman within the class Solution.
    2. Classes must have fields: name(String), age(int), address(String).
    3. Create constructors to pass all the possible parameters to.
    4. Use the constructor to create two objects of each class with all the data.
    5. Display the objects in format [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man m1 = new Man();
        Man m2 = new Man();

        Woman w1 = new Woman();
        Woman w2 = new Woman();

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(w1);
        System.out.println(w2);
    }

    public static class Man
    {
        String name = null;
        int age = -1;
        String address = null;

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Man()
        {
        }

        public Man(String name, int age)

        {
            this.name = name;
            this.age = age;
        }

        public Man(int age)
        {

            this.age = age;
        }

        public Man(String name)
        {

            this.name = name;
        }
    }

    public static class Woman
    {
        String name = null;
        int age = -1;
        String address = null;

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Woman()
        {
        }

        public Woman(String name, int age)

        {
            this.name = name;
            this.age = age;
        }

        public Woman(int age)
        {

            this.age = age;
        }

        public Woman(String name)
        {

            this.name = name;
        }
    }
}
