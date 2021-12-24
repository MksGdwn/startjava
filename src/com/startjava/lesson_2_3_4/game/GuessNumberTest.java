package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static Scanner scanner = new Scanner(System.in);
    public static byte gameCount = 0;

    public static void main(String[] args) {
        GuessNumber game = new GuessNumber();

        for (int i = 0; i < 3; i++) {
            addPlayerInGame(game);
        }

        while(true) {
            while (gameCount < 3) {
                System.out.println("Each player has 10 tries");
                game.play();
                gameCount++;
            }

            pickWinner(game);

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

    public static void pickWinner(GuessNumber game) {
        StringBuilder stringBuilder = new StringBuilder();
        Player[] players = game.getPlayers();

        int winCount = Math.max(players[2].getWinCount(),Math.max(players[0].getWinCount(), players[1].getWinCount()));

        if (winCount == 0) {
            System.out.println("No winners");
            return;
        }

        for (Player player : players) {
            if (player.getWinCount() == winCount) {
                if (stringBuilder.isEmpty()) {
                    stringBuilder.append(player.getName());
                }
                else {
                    stringBuilder.append(", ").append(player.getName());
                }
            }
        }

        stringBuilder.append(" ").append("win(s)!");

        System.out.println(stringBuilder);
    }
}