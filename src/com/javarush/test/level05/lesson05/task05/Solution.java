package com.javarush.test.level05.lesson05.task05;

/* Hold three twosome fights between cats
Create three cats using the class Cat.
    Hold three pairwise fights between cats.
    Do not create the class Cat. For the fight, use the method boolean fight(Cat anotherCat).
    Display the result of each fight.
*/

public class Solution {
    public static void main(String[] args) {
        Cat c1 = new Cat("Ziomek", 2, 3, 56);
        Cat c2 = new Cat("Ziomus", 2, 3, 55);
        Cat c3 = new Cat("Ziomka", 2, 3, 9999);

        if(c1.fight(c2)) System.out.println(true);
        else System.out.println(false);
        if(c1.fight(c3)) System.out.println(true);
        else System.out.println(false);
        if(c3.fight(c2)) System.out.println(true);
        else System.out.println(false);
    }

    public static class Cat {

        public static int count = 0;
        public static int fightCount = 0;

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            fightCount++;

            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
