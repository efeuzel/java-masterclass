package com.company;

import java.util.ArrayList;
import java.util.List;

public class SimCity implements ISaveable {
    private int numberOfCities;
    private int population;

    @Override
    public List<Integer> dataToSave() {
        ArrayList<Integer> dataToSave = new ArrayList<>();
        dataToSave.add(numberOfCities);
        dataToSave.add(population);
        return dataToSave;
    }

    @Override
    public void loadFromSavedData(List<Integer> data) {
        numberOfCities = data.get(0);
        population = data.get(1);
    }

    @Override
    public String toString() {
        return "SimCity game with " + numberOfCities + " cities and total population " + population;
    }

    public int getNumberOfCities() {
        return numberOfCities;
    }

    public void setNumberOfCities(int numberOfCities) {
        this.numberOfCities = numberOfCities;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
