package com.company;

public class Main {

    public static void main(String[] args) {
	    //float occupies 32 bits, double occupies 64 bits
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float MIN value = " + myMinFloatValue);
        System.out.println("Float MAX value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double MIN value = " + myMinDoubleValue);
        System.out.println("Double MAX value = " + myMaxDoubleValue);

        //int does not handle remainder
        int myIntValue = 5 / 3;
        //decimal numbers are assumed to be double so we need casting to float
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        //Challenge
        double weightInPounds = 200;
        double weightInKG = weightInPounds * 0.45359237;
        System.out.println("Weight converted to kg is: " + weightInKG);
    }
}
