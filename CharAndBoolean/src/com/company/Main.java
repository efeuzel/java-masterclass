package com.company;

public class Main {

    public static void main(String[] args) {
        //char stores only one character, occupies 16 bits, stores Unicode characters
        //we can look at unicode-table.com
        char myChar = 'D';
        char myUnicode = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicode);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
    }
}
