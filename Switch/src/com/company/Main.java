package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        int switchValue  = 6;

        switch(switchValue) {
            case 1:
                System.out.println("Value is one.");
                break;

            case 2:
                System.out.println("Value is two.");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was three, four or five.");
                break;
            default:
                System.out.println("Value was not one, two, three, four or five.");
                break; //not needed but good to have for consistency
            //breaks are vital for proper execution

        }

        char charSwitchValue = 'F';
        switch(charSwitchValue) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            case 'E':
                System.out.println("E");
                break;
            default:
                System.out.println("other");
                break;
        }

        String month = "JAnuary";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("June");
                break;

        }

    }
}
