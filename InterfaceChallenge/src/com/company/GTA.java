package com.company;

import java.util.ArrayList;
import java.util.List;

public class GTA implements ISaveable{
    private int level;
    private int totalMoney;

    @Override
    public List<Integer> dataToSave() {
        List<Integer> data = new ArrayList<>();
        data.add(level);
        data.add(totalMoney);
        return data;
    }

    @Override
    public void loadFromSavedData(List<Integer> data) {
        level = data.get(0);
        totalMoney = data.get(1);
    }

    @Override
    public String toString() {
        return "GTA game with level " + level + " and total money " + totalMoney;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }
}
