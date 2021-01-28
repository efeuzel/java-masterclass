package com.company;

import java.util.ArrayList;

public class Team<T> implements Comparable<Team<T>>{
    private String name;
    private ArrayList<T> members = new ArrayList<>();
    private int totalScore;

    public Team(String name, int totalScore) {
        this.name = name;
        this.totalScore = totalScore;
    }

    public void add(T player) {
        if(!members.contains(player)) members.add(player);
    }

    @Override
    public String toString() {
        return "Team " + name + " - Total Score " + totalScore;
    }

    @Override
    public int compareTo(Team<T> o) {
        if(this.totalScore > o.totalScore) return -1;
        if(this.totalScore < o.totalScore) return 1;
        return 0;
    }

    public ArrayList<T> getMembers() {
        return members;
    }
}
