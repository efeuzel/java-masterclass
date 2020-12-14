package com.company;

public class Main {

    public static void main(String[] args) {
        displayHighScorePosition("Efe", calculateHighScorePosition(1000));
        displayHighScorePosition("Emra", calculateHighScorePosition(700));
        displayHighScorePosition("Cansu", calculateHighScorePosition(300));
        displayHighScorePosition("Erdem", calculateHighScorePosition(0));

    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " is placed at position "
                + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;
    }
}
