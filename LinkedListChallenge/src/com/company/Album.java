package com.company;

import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
        songs.add(new Song("Song 1"));
        songs.add(new Song("Song 2"));
        songs.add(new Song("Song 3"));
        songs.add(new Song("Song 4"));
        songs.add(new Song("Song 5"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }
}
