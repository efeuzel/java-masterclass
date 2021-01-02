package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = getIntegers(3);
        printArray(a);
        printArray(sortIntegers(a));


    }

    public static int[] getIntegers(int length) {
        System.out.println("Please enter " + length + " integers:");
        Scanner s = new Scanner(System.in);
        int[] a = new int[length];
        for (int i = 0; i < length; i++) {
            a[i] = s.nextInt();
        }
        return a;
    }

    public static void printArray(int[] a) {
        System.out.print("Array is: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int[] sortIntegers(int[] a) {
        /*int[] s = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            s[i] = a[i];
        }*/
        int[] s = Arrays.copyOf(a, a.length);
        Arrays.sort(s);
        return s;
    }
}
