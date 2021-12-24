package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userAnswer = "yes";
        while(userAnswer.equals("yes")) {
            String[] expression;
            do {
                System.out.print("Enter a mathematical expression: ");
                expression = scanner.nextLine().split(" ");
                if (checkUserNumber(expression[0]) && checkUserNumber(expression[2])) {
                    break;
                }
                System.out.println("Please use integer types only.");
            } while (true);

            int result = Calculator.calculate(Integer.parseInt(expression[0]), Integer.parseInt(expression[2]), expression[1]);

            System.out.println(result);

            System.out.print("Do you want to continue calculating? [yes/no]: ");
            userAnswer = scanner.nextLine();
            while (!userAnswer.equals("yes") && !userAnswer.equals("no")) {
                System.out.print("I don't understand. Do you want to continue calculating? [yes/no]: ");
                userAnswer = scanner.nextLine();
            }
        }
    }

    public static boolean checkUserNumber(String number) {
        if (number.contains(".")) {
            return false;
        }

        return Integer.parseInt(number) > 0;
    }
}