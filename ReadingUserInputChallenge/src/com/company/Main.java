package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while(counter <= 10) {
            System.out.println("Enter a number for place " + counter);

            if (scanner.hasNextInt()){
                counter++;
                sum += scanner.nextInt();
            } else {
                System.out.println("Cannot parse number");
            }
            scanner.nextLine();
        }

        System.out.println("sum = " + sum);



        scanner.close();

    }

}
