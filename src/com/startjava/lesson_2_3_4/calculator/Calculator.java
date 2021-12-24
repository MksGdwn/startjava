package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public static int calculate(int a, int b, String operation) {
        return switch (operation) {
            case "+" -> {
                yield Math.addExact(a, b);
            }
            case "-" -> {
                yield Math.subtractExact(a, b);
            }
            case "*" -> {
                yield Math.multiplyExact(a, b);
            }
            case "/" -> {
                yield a / b;
            }
            case "^" -> {
                yield (int) Math.pow(a, b);
            }
            case "%" -> {
                yield a % b;
            }
            default -> {
                yield 0;
            }
        };
    }
}