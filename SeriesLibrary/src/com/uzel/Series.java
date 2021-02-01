package com.uzel;

public class Series {
    public static int nSum(int n) {
        return n*(n+1)/2;
    }

    public static int factorial(int n) {
        if (n == 0) return 0;
        int fact = 1;
        for(int i = 2; i<= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int fibonacci(int n) {
        int pp = 0;
        int p = 1;
        int curr = 0;
        for(int i = 2; i <= n; i++) {
            curr = pp + p;
            pp = p;
            p = curr;
        }
        return curr;
    }


}
