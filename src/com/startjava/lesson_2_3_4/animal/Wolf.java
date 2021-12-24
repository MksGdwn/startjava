package com.startjava.lesson_2_3_4.animal;

public class Wolf {
    private boolean isMale;
    private String name;
    private double weight;
    private int age;
    private String color;

    public boolean getIsMale() {
        return this.isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Incorrect age");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println(name + " is walking");
    }

    public void sit() {
        System.out.println(name + " is sitting");
    }

    public void run() {
        System.out.println(name + " is running");
    }

    public void howl() {
        System.out.println(name + " is howling");
    }

    public void hunt() {
        System.out.println(name + " is hunting");
    }
}