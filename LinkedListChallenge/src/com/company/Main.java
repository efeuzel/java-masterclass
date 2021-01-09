package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Album a1 = new Album("Album 1");
        //Album a2 = new Album("Album 2");

        LinkedList<Song> playList = new LinkedList<>(a1.getSongs());

        Scanner s = new Scanner(System.in);
        boolean quit = false;
        ListIterator<Song> it = playList.listIterator();
        Song current = it.next();
        System.out.println("Playing " + current.getTitle() );
        boolean forward = true;
        while (!quit) {
            System.out.println("Select option: 1-Quit, 2-Skip Forward, 3-Skip Backward, 4-Replay Current");
            int selection = s.nextInt();
            s.nextLine();
            switch (selection) {
                case 1:
                    quit = true;
                    break;
                case 2:
                    if (!forward) {
                        current  = it.next();
                        forward = true;
                    }
                    if(it.hasNext()){
                        current = it.next();
                        System.out.println("Playing " + current.getTitle() );
                    } else {
                        System.out.println("Already at the end");
                    }

                    break;
                case 3:
                    if(forward) {
                        current = it.previous();
                        forward = false;
                    }
                    if(it.hasPrevious()) {
                        current = it.previous();
                        System.out.println("Playing " + current.getTitle() );
                    } else {
                        System.out.println("Already at the beginning");
                    }

                    break;
                case 4:
                    System.out.println("Playing " + current.getTitle() );
                    break;
                default:
                    System.out.println("Invalid selection");
            }

        }


    }
}
