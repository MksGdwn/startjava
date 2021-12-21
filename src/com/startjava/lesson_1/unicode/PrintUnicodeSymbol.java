package com.startjava.lesson_1.unicode;

public class PrintUnicodeSymbol {
    public static void main(String[] args) {
        char symbol = 33;

        while(symbol <= 126) {
            System.out.println(symbol++);
        }
    }
}