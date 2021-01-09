package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> simCityData = new ArrayList<>();
        simCityData.add(3);
        simCityData.add(1500000);

        SimCity myGame = new SimCity();
        loadGame(myGame, simCityData);

        myGame.setNumberOfCities(4);
        myGame.setPopulation(2000000);
        saveGame(myGame);

        ArrayList<Integer> gtaData = new ArrayList<>();
        gtaData.add(6);
        gtaData.add(2000000);

        GTA myOtherGame  = new GTA();
        loadGame(myOtherGame, gtaData);

        myOtherGame.setLevel(11);
        myOtherGame.setTotalMoney(3250000);
        saveGame(myOtherGame);
    }

    public static void loadGame(ISaveable game, List<Integer> data) {
        System.out.println("Loading game... ");
        game.loadFromSavedData(data);
        System.out.println("Loaded game is");
        System.out.println(game.toString());
    }

    public static void saveGame(ISaveable game) {
        System.out.println("Saving game...");
        System.out.println("Saved game is:");
        System.out.println(game.toString());

    }

}
