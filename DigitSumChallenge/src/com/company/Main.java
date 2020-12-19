package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(5));
        System.out.println(sumDigits(51));
        System.out.println(sumDigits(222));
        System.out.println(sumDigits(1111));
        System.out.println(sumDigits(99999));
    }

    public static int sumDigits(int number) {

        if (number < 10) return -1;
        int leastSignificantDigit;
        int sumOfDigits = 0;
        while(number > 0) {
            leastSignificantDigit = number % 10;
            sumOfDigits += leastSignificantDigit;
            number = number / 10; //discarding current least significant digit
        }
        return sumOfDigits;
    }
}
