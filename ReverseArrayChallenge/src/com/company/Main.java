package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println("Original array is " + Arrays.toString(a));
        reverse(a);
        System.out.println("Reversed array is " + Arrays.toString(a));

    }

    public static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int tmp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = tmp;
        }
    }
}
