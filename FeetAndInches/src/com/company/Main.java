package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(100));
        System.out.println(calcFeetAndInchesToCentimeters(5,9));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0) return -1;
        if (inches < 0 || inches > 12) return -1;
        return feet * 12 * 2.54 + inches * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) return -1;
        double feet = (int) (inches / 12);
        double remainderInches = inches % 12;
        return calcFeetAndInchesToCentimeters(feet, remainderInches);
    }
}
