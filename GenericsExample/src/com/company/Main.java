package com.company;

public class Main {

    public static void main(String[] args) {
		Team<FootballPlayer> t1 = new Team<>("Galatasaray", 10);
		Team<FootballPlayer> t3 = new Team("Beşiktaş", 7);
		Team<FootballPlayer> t2 = new Team("Fenerbahçe", 9);
		Team<BasketballPlayer> t4 = new Team("Efes", 1);

		t1.add(new FootballPlayer()); // OK
		//t1.add(new BasketballPlayer()); Gives an error

		League<Team<FootballPlayer>> league = new League<>();
		league.add(t1);
		league.add(t2);
		league.add(t3);
		//league.add(t4); Gives an error

		league.printLeaderboard();

    }
}
