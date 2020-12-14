package com.company;

public class Main {

    public static void main(String[] args) {

        double d1 = 20.0;
        double d2 = 80.0;
        double remainder = ((d1 + d2) * 100.0) % 40.0;
        boolean isRemainderZero = remainder == 0.0 ? true : false;
        System.out.println("isRemainderZero = " + isRemainderZero);
        if (!isRemainderZero) {
            System.out.println("Got some remainder.");
        }
    }
}