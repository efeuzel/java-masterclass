package com.company;

public class Car extends Vehicle{

    public Car(String name) {
        super(name);
    }

    public void changeGears() {
        System.out.println("Car has changed gears.");
    }

    @Override
    public void steer() {
        System.out.println("Car steering wheel has turned.");
    }
}
