package com.company;

public class Main {

    public static void main(String[] args) {
        byte myByte = 10;
        short myShort = 5000;
        int myInt = 800000;
        long myLong = 50_000L + 10L * (myByte + myShort + myInt);
        System.out.println(myLong);

        short shortTotal = (short)
                (1000 + 10 * (myByte + myShort + myInt));
        System.out.println(shortTotal);
    }
}
