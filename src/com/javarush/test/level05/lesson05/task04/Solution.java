package com.javarush.test.level05.lesson05.task04;

/* Create three objects of Cat type
Create three objects of type Cat in the method main and fill them with data.
    Use the class Cat of the first task. Do not create the class Cat.
*/

public class Solution {
    public static void main(String[] args) {
        Cat c1 = new Cat("Ziomek", 2, 3, 56);
        Cat c2 = new Cat("Ziomus", 2, 3, 55);
        Cat c3 = new Cat("Ziomka", 2, 3, 9999);
    }

    public static class Cat {

        public static int count = 0;
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
