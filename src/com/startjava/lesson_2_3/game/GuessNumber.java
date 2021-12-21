package com.startjava.lesson_2_3.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int number;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private int createRandomInteger() {
        Random random = new Random();
        return random.nextInt(101);
    }

    public void play() {
        number = createRandomInteger();
        Scanner scanner = new Scanner(System.in);

        Player player = player1;
        while(true) {
            System.out.println(player.getName() + " turn");

            System.out.println("Enter expected number: ");
            int playerNumber = scanner.nextInt();

            if (playerNumber == number) {
                System.out.println(player.getName() + " won");
                break;
            } else if (playerNumber > number) {
                System.out.println("This number is higher than number that the computer guessed");
            } else {
                System.out.println("This number is smaller than number that the computer guessed");
            }

            if (player == player1) {
                player = player2;
            } else {
                player = player1;
            }
        }
    }

    public boolean checkNumber(int number) {
        return this.number == number;
    }
}