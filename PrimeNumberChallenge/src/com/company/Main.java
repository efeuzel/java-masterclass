package com.company;

public class Main {

    public static void main(String[] args) {
        int primeCount = 0;

        for(int i = 1; i < 100; i++) {
	        if(isPrime(i)){
                primeCount++;
                if(primeCount > 3) break;
                System.out.println(i + " is a prime");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number == 1) return false;

        for(int i = 2; i < number/2; i++) {
            if (number % i == 0) return false;
        }

        return true;
    }
}
