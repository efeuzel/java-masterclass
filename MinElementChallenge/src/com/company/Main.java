package com.company;

import java.util.Scanner;

public class Main {

    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter array size: ");
        int size = s.nextInt();
        s.nextLine();
        int[] a = getIntegers(size);
        System.out.println(findMin(a));
    }

    public static int[] getIntegers(int length) {
        System.out.println("Please enter " + length + " integers:");
        int[] a = new int[length];
        for (int i = 0; i < length; i++) {
            a[i] = s.nextInt();
        }
        return a;
    }

    public static int findMin(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int j : a) {
            if (min > j) min = j;
        }
        return min;
    }
}
