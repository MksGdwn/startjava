package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int[] playerNumbers = new int[10];
    private byte index;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int[] getPlayerNumbers() {
        return playerNumbers;
    }

    public boolean addNumber(int number) {
        if (number >= 0 && number <= 100) {
            this.playerNumbers[index++] = number;
            return true;
        }
        return false;
    }

    public String printPlayerNumbers() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int number : playerNumbers) {
            if (number == 0) {
                break;
            }
            else {
                stringBuilder.append(number).append(" ");
            }
        }
        return String.valueOf(stringBuilder);
    }

    public byte getIndex() {
        return index;
    }

    public void setIndex(byte index) {
        this.index = index;
    }
}