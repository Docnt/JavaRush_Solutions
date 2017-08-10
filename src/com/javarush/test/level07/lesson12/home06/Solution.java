package com.javarush.test.level07.lesson12.home06;

/* Family
Create a class Human with the fields: String name, boolean sex, int age, Human father, Human mother.
Create 9 objects of Human class and fill them in such a way as to obtain two grandfathers, two grandmothers, a father,
a mother, and three children. Display to the screen the objects to the screen.
    Tip:
    If you write your method String toString() in the class Human, then it’ll be used to display an object.
    Example output:
    Name: Anna, sex: female, age: 21, father: Paul, mother: Kate
    Name: Kate, sex: female, age: 55
    Name: Ian, sex: male, age: 2, father: Michael, mother: Anna
    …
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human gFather1 = new Human("GrandFather1", true, 55, null, null);
        Human gMother1 = new Human("GrandMother1", false, 54, null, null);
        Human gFather2 = new Human("GrandFather2", true, 57, null, null);
        Human gMother2 = new Human("GrandMother2", false, 56, null, null);
        Human father1 = new Human("Father", true, 45, gFather1, gMother1);
        Human mother1 = new Human("Mother", false, 44, gFather2, gMother2);
        Human kids1 = new Human("Kid1", true, 24, father1, mother1);
        Human kids2 = new Human("Kid2", true, 24, father1, mother1);
        Human kids3 = new Human("Kid3", true, 24, father1, mother1);

        System.out.println(gFather1);
        System.out.println(gMother1);
        System.out.println(gFather2);
        System.out.println(gMother2);
        System.out.println(father1);
        System.out.println(mother1);
        System.out.println(kids1);
        System.out.println(kids2);
        System.out.println(kids3);
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human (String name, Boolean sex, int age, Human father, Human mother){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
        }

        public String toString()
        {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }

}
