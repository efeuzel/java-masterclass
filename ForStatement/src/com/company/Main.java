package com.company;

public class Main {

    public static void main(String[] args) {

        //for(init; termination; increment)
        for(double i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.1f",calculateInterest(10000.0, i)));
        }

        System.out.println("******");

        for(double i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.1f",calculateInterest(10000.0, i)));
        }
    }

    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
