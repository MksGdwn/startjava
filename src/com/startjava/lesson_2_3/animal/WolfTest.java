package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] arg) {
        Wolf wolf = new Wolf();
        wolf.setIsMale(true);
        wolf.setName("Gera");
        wolf.setWeight(34.0);
        wolf.setAge(2);
        wolf.setAge(10);
        wolf.setColor("gray");

        System.out.println(wolf.getIsMale());
        System.out.println(wolf.getName());
        System.out.println(wolf.getWeight());
        System.out.println(wolf.getAge());
        System.out.println(wolf.getColor());
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}