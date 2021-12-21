package com.startjava.lesson_1.app;

public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 31;
        double height = 1.80;
        boolean isMan = true;
        char symbol = 'M';

        if (age > 20) {
            System.out.println("Your age is over 20");
        } 

        if (isMan) {
            System.out.println("Your are man");
        } 

        if (!isMan) {
            System.out.println("Your are woman");
        } 

        if (height < 1.80) {
            System.out.println("Your height is less than 1.80");
        } else {
            System.out.println("Your height is more than 1.80");
        }

        if (symbol == 'M') {
            System.out.println("Your name begins with M");
        } else if (symbol == 'I') {
            System.out.println("Your name begins with I");
        } else {
            System.out.println("Your name does not begin with M or I");
        }
    }
}