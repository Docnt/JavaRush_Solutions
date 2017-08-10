package com.javarush.test.level05.lesson05.task03;

/* Getters and setters for the class Dog
Create a class Dog. A dog must have a name - String name and age - int age.
    Create getters and setters for all the variables of the Dog class.
*/

public class Dog {
    String name;
    int age;

    public String getName()
    {
        return name;
    }

    public void setName(String x)
    {
        name = x;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int x)
    {
        age = x;
    }
}
