package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class League<T extends Team>{
    private ArrayList<T> teams = new ArrayList<>();

    public void printLeaderboard() {
        Collections.sort(teams);
        for (Team t :teams) {
            System.out.println(t.toString());
        }
    }

    public void add(T team) {
        teams.add(team);
    }
}
