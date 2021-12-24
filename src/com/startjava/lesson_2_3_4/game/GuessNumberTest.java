package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        GuessNumber game = new GuessNumber();

        for (int i = 0; i < 3; i++) {
            addPlayerInGame(game);
        }

        while(true) {
            System.out.println("Each player has 10 tries");
            game.play();

            System.out.print("Do you want to start a new game? [yes/no]: ");
            String userAnswer = scanner.nextLine();
            while (!userAnswer.equals("yes") && !userAnswer.equals("no")) {
                System.out.print("I don't understand. Do you want to start a new game? [yes/no]: ");
                userAnswer = scanner.nextLine();
            }

            if (!userAnswer.equals("yes")) {
                break;
            } 
        }
    }

    public static void addPlayerInGame(GuessNumber game) {
        System.out.println("Enter player name: ");
        game.addPlayer(new Player(scanner.nextLine()));
    }
}