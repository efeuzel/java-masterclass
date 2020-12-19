package com.company;

public class Main {

    public static void main(String[] args) {
        numberToWords(11452);
    }

    public static void numberToWords(int number) {
        if (number >= 0) {
            int originalNumber = number;
            number = reverse(number);
            do {
                switch (number % 10) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                number /= 10;
            } while (number > 0);
            for (int i = 0; i < (getDigitCount(originalNumber) - getDigitCount(reverse(originalNumber))); i++) {
                System.out.println("Zero");
            }

        } else {
            System.out.println("Invalid Value");
        }
    }

    public static int reverse(int number) {
        int negativeFlag = 1;
        if (number < 0) {
            negativeFlag = -1;
            number *= -1;
        }

        int reverse = 0;
        while (number > 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return reverse * negativeFlag;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        if (number == 0) return 1;
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

}
