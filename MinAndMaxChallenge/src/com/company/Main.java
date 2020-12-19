package com.company;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Start entering numbers...");
        while(true){
            if(scanner.hasNextInt()){
                int input = scanner.nextInt();
                if(input > max) max = input;
                if(input < min) min = input;
            } else {
                break;
            }
            scanner.nextLine();
            System.out.println("max = " + max + " min = " + min);
        }
    }
}
