package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player[] players = new Player[3];
    private int number;
    private byte index = 0;

    private int createRandomInteger() {
        Random random = new Random();
        return random.nextInt(101);
    }

    private void resetPlayerFields(Player player) {
        Arrays.fill(player.getPlayerNumbers(), 0);
        player.setIndex((byte) 0);
    }

    private void printPlayerMoves(Player player) {
        System.out.println(player.getName() + "'s moves: " + player.printPlayerNumbers());
    }

    private void shufflePlayers() {
        Collections.shuffle(Arrays.asList(players));
    }

    public void addPlayer(Player player) {
        players[index++] = player;
    }

    public void play() {
        number = createRandomInteger();
        Scanner scanner = new Scanner(System.in);

        shufflePlayers();

        Player player = players[0];

        while(true) {
            if (players[0].getIndex() == 10 && players[1].getIndex() == 10 && players[2].getIndex() == 10) {
                break;
            }
            System.out.println(player.getName() + " turn");

            System.out.println("Enter expected number: ");
            int playerNumber = scanner.nextInt();
            if(!player.addNumber(playerNumber)) {
                System.out.println("Incorrect number.");
                continue;
            }

            if (playerNumber == number) {
                System.out.println("Player " + player.getName() +
                        " guessed the number " + number +
                        " on " + player.getIndex() + " tries");
                break;
            }
            else if (playerNumber > number) {
                System.out.println("This number is higher than number that the computer guessed");
            }
            else {
                System.out.println("This number is smaller than number that the computer guessed");
            }

            if (player.getIndex() == 10) {
                System.out.println(player.getName() + " has run out of tries");
            }

            if (player == players[0]) {
                player = players[1];
            }
            else if (player == players[1]) {
                player = players[2];
            }
            else {
                player = players[0];
            }
        }

        for (Player playerInstance : players) {
            printPlayerMoves(playerInstance);
            resetPlayerFields(playerInstance);
        }
    }
}