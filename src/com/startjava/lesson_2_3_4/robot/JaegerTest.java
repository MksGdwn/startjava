package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
            Jaeger jaeger1 = new Jaeger("Guardian Bravo", "Mark-6", 73.21F, 1.975F, 5, 9);
            Jaeger jaeger2 = new Jaeger();

            jaeger2.setModelName("Gipsy Avenger");
            jaeger2.setMark("Mark-6");
            jaeger2.setHeight(81.77f);
            jaeger2.setWeight(2.004f);
            jaeger2.setStrength(8);
            jaeger2.setArmor(8);

            System.out.println("Model name: " + jaeger1.getModelName() + "\n" +
                    "Series: " + jaeger1.getMark() + "\n" +
                    "Height: " + jaeger1.getHeight() + "\n" +
                    "Weight: " + jaeger1.getWeight() + "\n" +
                    "Strength: " + jaeger1.getStrength() + "\n" +
                    "Armor: " + jaeger1.getArmor());
            System.out.println("Model name: " + jaeger2.getModelName() + "\n" +
                    "Series: " + jaeger2.getMark() + "\n" +
                    "Height: " + jaeger2.getHeight() + "\n" +
                    "Weight: " + jaeger2.getWeight() + "\n" +
                    "Strength: " + jaeger2.getStrength() + "\n" +
                    "Armor: " + jaeger2.getArmor());
    }
}